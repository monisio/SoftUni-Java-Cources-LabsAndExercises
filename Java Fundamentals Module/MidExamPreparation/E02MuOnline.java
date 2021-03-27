package Fundamentals.MidExamPreparation;

import java.util.Scanner;

public class E02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|+");

        int health = 100;
        int bitcoin = 0;

        int bestRoomNumber=0;
//

        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("\\s+");
            String currentCommand = tokens[0];
            int quantity = Integer.parseInt(tokens[1]);
            bestRoomNumber++;

            switch (currentCommand) {
                case "potion":

                    int currentHealth = health;
                    health += quantity;
                    if (health > 100) {
                        health = 100;
                        int amount = 100 - currentHealth;
                        System.out.printf("You healed for %d hp.%n", amount);
                    } else {
                        System.out.printf("You healed for %d hp.%n", quantity);
                    }
                    System.out.printf("Current health: %d hp.%n", health);


                    break;
                case "chest":
                    bitcoin+=quantity;
                    System.out.printf("You found %d bitcoins.%n",quantity);

                    break;

                default:
                    health-=quantity;

                    if (health<=0){


                        System.out.printf("You died! Killed by %s.%n",currentCommand );
                        System.out.println("Best room: "+bestRoomNumber);
                        return;
                    }

                    System.out.printf("You slayed %s.%n",currentCommand);

                    break;
            }
        }

        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d",bitcoin,health);

    }
}
