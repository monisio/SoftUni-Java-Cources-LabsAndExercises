package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("shards", 0);
        inventory.put("motes", 0);
        inventory.put("fragments", 0);


        String item = null;


        while (item == null) {

            String[] inputAsArray = input.toLowerCase().split(" ");

            for (int i = 0; i < inputAsArray.length - 1; i += 2) {


                int quantity = Integer.parseInt(inputAsArray[i]);
                String resource = inputAsArray[i + 1];

                if (inventory.get(resource) == null) {
                    inventory.put(resource, 0);
                }

                inventory.put(resource, inventory.get(resource) + quantity);


                String acquiredItem = checkForLegendaryAcquired(inventory);

                if (acquiredItem != null) {
                    item = acquiredItem;
                    break;
                }


            }

            if (item != null) {
                break;
            }

            input = scanner.nextLine();
        }


        System.out.println(item + " obtained!");

        inventory.entrySet().stream()
                .filter(k -> k.getKey().equals("shards") || k.getKey().equals("motes") || k.getKey().equals("fragments"))
                .sorted((v1, v2) -> {
                    int result = v2.getValue().compareTo(v1.getValue());
                    if (result == 0) {
                        result = v1.getKey().compareTo(v2.getKey());
                    }
                    return result;
                })
                .forEach((entry) -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        inventory.entrySet().stream()
                .filter(k -> !(k.getKey().equals("shards") || k.getKey().equals("motes") || k.getKey().equals("fragments")))
                .sorted((v1, v2) -> v1.getKey().compareTo(v2.getKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));


    }

    private static String checkForLegendaryAcquired(Map<String, Integer> inventory) {
        String item = null;


        if (inventory.get("shards") >= 250) {
            inventory.put("shards", inventory.get("shards") - 250);
            item = "Shadowmourne";

        } else if (inventory.get("fragments") >= 250) {
            inventory.put("fragments", inventory.get("fragments") - 250);
            item = "Valanyr";

        } else if (inventory.get("motes") >= 250) {
            inventory.put("motes", inventory.get("motes") - 250);
            item = "Dragonwrath";

        }


        return item;
    }
}
