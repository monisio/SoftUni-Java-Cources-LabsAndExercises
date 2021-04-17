package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Engine> enginesCollection = new HashMap<>();
        Map<String, Car> carCollection = new HashMap<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s");
            String model = input[0];
            int horsePower = Integer.parseInt(input[1]);

            Engine createdEngine= null;

            if (input.length==2) {
                 createdEngine= new Engine(model, horsePower);
            }else if(input.length==3){

                if(input[2].length()>1){

                }

            }else if(input.length==4){

            }

        }


    }
}
