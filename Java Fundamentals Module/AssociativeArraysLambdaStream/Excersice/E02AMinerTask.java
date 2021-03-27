package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, Integer> minedMaterials = new LinkedHashMap<>();


        while (!input.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());


            if (minedMaterials.get(input) == null) {
                minedMaterials.put(input, 0);
            }

            minedMaterials.put(input, minedMaterials.get(input)+quantity);

            input = scanner.nextLine();
        }


        minedMaterials.forEach((s, integer) -> System.out.println(s+" -> "+ integer));

    }
}
