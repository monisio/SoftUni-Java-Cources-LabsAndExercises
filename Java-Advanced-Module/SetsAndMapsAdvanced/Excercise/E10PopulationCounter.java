package AdvancedJava.SetsAndMapsAdvanced.Excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E10PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , Map<String, Integer>>  populationCounter = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("report")){
            String [] inputArray = input.split("\\|");

            populationCounter.putIfAbsent(inputArray[1], new HashMap<>());
            populationCounter.get(inputArray[1]).put(inputArray[0],Integer.valueOf(inputArray[2]));


            input=scanner.nextLine();
        }

         populationCounter.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().values().stream().mapToInt(e -> e).sum(), e1.getValue().values().stream().mapToInt(e -> e).sum())).forEach(e->{
             System.out.println(e.getKey()+" (total population: " + e.getValue().values().stream().mapToInt(i->i).sum()+")");
             e.getValue().entrySet().stream().sorted((e1,e2)-> Integer.compare(e2.getValue(),e1.getValue())).forEach(c-> System.out.println("=>"+ c.getKey() +": "+ c.getValue()));
         });


    }
}
