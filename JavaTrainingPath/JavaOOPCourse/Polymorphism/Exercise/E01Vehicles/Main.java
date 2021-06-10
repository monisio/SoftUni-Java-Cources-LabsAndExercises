package JavaOOPCourse.Polymorphism.Exercise.E01Vehicles;

import JavaOOPCourse.Polymorphism.Exercise.E02VehicleExtension.Bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputCar = scanner.nextLine().split("\\s+");
        String[] inputTruck = scanner.nextLine().split("\\s+");
        String[] inputBus = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(inputCar[1]), Double.parseDouble(inputCar[2]), Double.parseDouble(inputCar[3]));
        Vehicle truck = new Truck(Double.parseDouble(inputTruck[1]), Double.parseDouble(inputTruck[2]), Double.parseDouble(inputTruck[3]));
        Bus bus = new Bus(Double.parseDouble(inputBus[1]), Double.parseDouble(inputBus[2]), Double.parseDouble(inputBus[3]));

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            String command = token[0];
            double value = Double.parseDouble(token[2]);

            switch (token[1]) {
                case "Truck":
                    if (command.equals("Drive")) {
                        System.out.println(truck.drive(value));
                    } else {
                        truck.refuel(value);
                    }

                    break;

                case "Car":
                    if(command.equals("Drive")){
                        System.out.println(car.drive(value));
                    }else{
                        car.refuel(value);

                    }

                    break;
                case "Bus":

                    if (command.equals("DriveEmpty")){
                        System.out.println(bus.drive(value, true));
                    }else if (command.equals("Drive")){
                        System.out.println(bus.drive(value));
                    }else if (command.equals("Refuel")){
                        bus.refuel(value);
                    }


                    break;

            }


        }


        System.out.println(car.toString());

        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }


}
