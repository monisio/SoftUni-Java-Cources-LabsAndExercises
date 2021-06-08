package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        String[] inputTruck = scanner.nextLine().split("\\s+");


        Vehicle car = new Car(Double.parseDouble(inputCar[1]), Double.parseDouble(inputCar[2]));
        Vehicle truck = new Truck(Double.parseDouble(inputTruck[1]), Double.parseDouble(inputTruck[2]));

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            double value =Double.parseDouble(token[2]);

            switch (token[0]) {
                case "Drive":
                    if (token[1].equals("Car")) {
                        drive(car, value);
                    } else {
                        drive(truck, value);
                    }

                    break;
                case "Refuel":

                    if (token[1].equals("Car")) {
                        refuel(car, value);
                    } else {
                        refuel(truck, value);
                    }


                    break;

            }


        }


        System.out.println(car.toString());
        System.out.println(truck.toString());

    }


    public static void drive(Vehicle vehicle, double distance) {
        vehicle.drive(distance);

    }

    public static void refuel(Vehicle vehicle, double quantity) {
        vehicle.refuel(quantity);

    }
}
