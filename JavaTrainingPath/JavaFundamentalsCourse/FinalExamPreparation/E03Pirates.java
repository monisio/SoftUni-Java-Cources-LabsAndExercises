package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class E03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> towns = new LinkedHashMap();

        String input = scanner.nextLine();


        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\||");

            List <Integer> town = towns.get(tokens[0]) ;

            if(town!=null){
                Integer currentPopulation = town.get(1);
                Integer currentGold = town.get(2);
                town.set(0, currentPopulation+Integer.parseInt(tokens[1]));
                town.set(1, currentGold+Integer.parseInt(tokens[2]));

            }else{
                towns.put(tokens[0],List.of(Integer.parseInt(tokens[1],Integer.parseInt(tokens[2]))));
            }


            input = scanner.nextLine();
        }


    }
}
