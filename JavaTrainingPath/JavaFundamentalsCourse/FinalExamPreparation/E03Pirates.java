package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.*;

public class E03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> towns = new HashMap<>();

        String input = scanner.nextLine();


        while (!input.equals("Sail")) {
            String[] tokens = input.split("\\|+");

            List<Integer> town = towns.get(tokens[0]);

            if (town != null) {
                Integer currentPopulation = town.get(0);
                Integer currentGold = town.get(1);
                town.set(0, currentPopulation + Integer.parseInt(tokens[1]));
                town.set(1, currentGold + Integer.parseInt(tokens[2]));

            } else {
                towns.put(tokens[0], new ArrayList<>(Arrays.asList( Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]))));
            }
                // note: usage of List.of() creates unmuttable list inside the map by default.

            input = scanner.nextLine();
        }

        String events = scanner.nextLine();

        while (!events.equals("End")) {
            String[] commands = events.split("=>");

            List<Integer> currentTown = towns.get(commands[1]);
            Integer population = currentTown.get(0);
            Integer gold = currentTown.get(1);
            String message = null;

            switch (commands[0]) {

                case "Plunder":
                    int peopleKilled = Integer.parseInt(commands[2]);
                    int goldStolen = Integer.parseInt(commands[3]);

                    currentTown.set(0, population-peopleKilled);
                    currentTown.set(1, gold-goldStolen);

                    message= String.format("%s plundered! %d gold stolen, %d citizens killed.",commands[1],goldStolen,peopleKilled );

                    break;
                case "Prosper":
                    int goldToAdd = Integer.parseInt(commands[2]);

                    if (goldToAdd >= 0) {
                        currentTown.set(1, gold + goldToAdd);

                        message = String.format("%d gold added to the city treasury. %s now has %d gold.", goldToAdd, commands[1], currentTown.get(1));

                    } else {
                        message = "Gold added cannot be a negative number!";
                    }

                    break;


            }
            System.out.println(message);

            if(currentTown.contains(0)){
                towns.remove(commands[1]);
                System.out.println( commands[1] +" has been wiped off the map!");
            }

            events = scanner.nextLine();
        }


        if (!towns.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",towns.size());

            towns.entrySet().stream()
                    .sorted((e1,e2)-> e2.getValue().get(1).compareTo(e1.getValue().get(1)))
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", e.getKey(), e.getValue().get(0), e.getValue().get(1)));


        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }




    }
}
