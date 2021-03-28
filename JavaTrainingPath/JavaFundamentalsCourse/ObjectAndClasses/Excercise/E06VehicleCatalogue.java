package JavaFundamentalsCourse.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06VehicleCatalogue {

    public static class Vehicle {

        String vehicleType;
        String model;
        String color;
        int horsePower;

        public Vehicle(String vehicleType, String model, String color, int horsePower) {

            if (vehicleType.equals("car")) {
                vehicleType = "Car";
            } else if (vehicleType.equals("truck")) {
                vehicleType = "Truck";
            }

            this.vehicleType = vehicleType;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public static Vehicle parseVehicle(String NewVehicleInfo) {
            String[] info = NewVehicleInfo.split("\\s");

            return new Vehicle(info[0], info[1], info[2], Integer.parseInt(info[3]));

        }

        public String getVehicleType() {
            return this.vehicleType;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }


        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getVehicleType(), getModel(), getColor(), getHorsePower());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehiclesCatalogue = new ArrayList<>();

        while (!input.equals("End")) {

            Vehicle a = Vehicle.parseVehicle(input);

            vehiclesCatalogue.add(a);

            input = scanner.nextLine();
        }

        String modelSearch = scanner.nextLine();

        while (!modelSearch.equals("Close the Catalogue")) {

            for (int i = 0; i < vehiclesCatalogue.size(); i++) {

                if (vehiclesCatalogue.get(i).getModel().equals(modelSearch)) {
                    System.out.println(vehiclesCatalogue.get(i).toString());
                }


            }


            modelSearch = scanner.nextLine();
        }


        getAverageHorsePower(vehiclesCatalogue);


    }

    private static void getAverageHorsePower(List<Vehicle> vehiclesCatalogue) {
/// initial mistake was dividing by zero and dividing zero to zero if some of the list are empty.

        double carAverageHorsePower = vehiclesCatalogue.stream()
                .filter(v -> v.getVehicleType().equals("Car"))
                .mapToDouble(v -> v.getHorsePower())
                .average().orElse(0.0);

        double truckAverageHorsePower = vehiclesCatalogue.stream()
                .filter(v -> v.getVehicleType().equals("Truck"))
                .mapToDouble(Vehicle::getHorsePower)
                .average().orElse(0.0);


        System.out.printf("Cars have average horsepower of: %.2f.%n", carAverageHorsePower);


        System.out.printf("Trucks have average horsepower of: %.2f.%n", truckAverageHorsePower);


    }
}
