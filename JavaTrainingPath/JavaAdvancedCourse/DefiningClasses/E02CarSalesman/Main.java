package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Engine> enginesCollection = new HashMap<>();
        Map<String, Car> carCollection = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s");
            String model = input[0];
            int horsePower = Integer.parseInt(input[1]);

            Engine createdEngine= null;

            if (input.length==2) {
                 createdEngine= new Engine(model, horsePower);
            }else if(input.length==3){

                if(Character.isDigit(input[2].charAt(0))){
                    createdEngine=new Engine(model,horsePower, Integer.parseInt(input[2]));
                }else {
                    createdEngine= new Engine(model,horsePower, input[2]);
                }

            }else if(input.length==4){
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                createdEngine = new Engine(model,horsePower,displacement,efficiency);
            }

            enginesCollection.putIfAbsent(model ,createdEngine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <m ; i++) {
            String[] input = scanner.nextLine().split("\\s");
            String model = input[0];
            String engineModel = input[1];
            Engine engine = enginesCollection.get(engineModel);

            Car createdCar = null;

            if(input.length == 2){
                createdCar= new Car(model,engine);
            }else if (input.length==3){
                if (Character.isDigit( input[2].charAt(0))){
                    int weight = Integer.parseInt(input[2]);
                    createdCar= new Car(model,engine,weight);

                }else {
                    String color = input[2];
                    createdCar= new Car(model,engine,color);
                }
            }else if (input.length==4){

                createdCar= new Car(model,engine,Integer.parseInt(input[2]), input[3]);

            }
            carCollection.putIfAbsent(model, createdCar);
        }


        for (Car value : carCollection.values()) {

            System.out.println(value.toString());
        }

    }
}
