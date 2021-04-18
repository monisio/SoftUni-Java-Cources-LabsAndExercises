package JavaAdvancedCourse.DefiningClasses.E03PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Map<String, Trainer> trainerMap = new LinkedHashMap<>();


        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Trainer current = trainerMap.get(trainerName);

            if (current == null) {
                trainerMap.put(trainerName, new Trainer(trainerName));
                current = trainerMap.get(trainerName);
            }

            current.addPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            input = scanner.nextLine();
        }

        input = scanner.nextLine();


        while (!input.equals("End")) {

            for (Trainer trainer : trainerMap.values()) {

                trainer.checkElement(input);
            }


            input = scanner.nextLine();
        }

        trainerMap.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getBadges(), t1.getValue().getBadges()))
                .forEach(t -> System.out.println(t.getKey()+" "+ t.getValue().getBadges() +" "+ t.getValue().getPokemonAmount()));

    }
}
