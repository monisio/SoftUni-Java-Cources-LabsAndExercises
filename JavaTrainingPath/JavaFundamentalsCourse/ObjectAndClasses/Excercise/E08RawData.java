package JavaFundamentalsCourse.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//model, engine, cargo and a collection of exactly 4 tires. The engine, cargo and tire should be separate classes, create a
// constructor that receives all information about the Car and creates and initializes its
// inner components (engine, cargo and tires).
public class E08RawData {
    static class Car {
        String model;
        Engine engine;
        Cargo cargo;
        List<Tires> tires = new ArrayList<>();


        public Car(String input) {
            String[] inputLine = input.split(" ");

            this.model = inputLine[0];
            this.engine = new Engine(Integer.parseInt(inputLine[1]), Integer.parseInt(inputLine[2]));
            this.cargo = new Cargo(Integer.parseInt(inputLine[3]), inputLine[4]);

            int index = 5;

            for (int i = 0; i < 4; i++) {
                tires.add(new Tires(Double.parseDouble(inputLine[index]), Integer.parseInt(inputLine[index + 1])));
                index += 2;
            }

        }

        public String getModel() {
            return this.model;
        }

        public String getCargoType() {
            return cargo.getType();

        }

        public int getEnginePower() {
            return engine.getEnginePower();
        }


        public double checkTirePressure() {
            double tirePressure = Double.MAX_VALUE;

            for (Tires tires : tires) {

                if (tires.getPressure() < tirePressure) {
                    tirePressure = tires.getPressure();

                }
            }

            return tirePressure;
        }

    }

    static class Engine {
        int engineSpeed;
        int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;

        }

        public int getEnginePower() {
            return this.enginePower;
        }
    }

    static class Cargo {
        int cargoWeight;
        String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;

        }

        public String getType() {
            return cargoType;
        }
    }

    static class Tires {
        double pressureTire;
        int ageTire;


        public Tires(double pressureTire, int ageTire) {
            this.pressureTire = pressureTire;
            this.ageTire = ageTire;
        }

        public double getPressure() {
            return this.pressureTire;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            Car newCar = new Car(input);

            carsList.add(newCar);
        }

        String command = scanner.nextLine();


        if (command.equals("flamable")) {


            for (Car car : carsList) {

                if (car.getCargoType().equals("flamable") && (car.getEnginePower() > 250)) {
                    System.out.println(car.getModel());
                }
            }

        } else {
            for (Car car : carsList) {

                if (car.getCargoType().equals("fragile") && (car.checkTirePressure() < 1)) {
                    System.out.println(car.getModel());
                }
            }
        }


    }

}
