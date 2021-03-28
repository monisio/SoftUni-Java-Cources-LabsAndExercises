package Fundamentals.MidExamPreparation;

import java.util.Scanner;

public class E01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int wins = 0;


        boolean isWon = true;


        // mistake was that there is nowere written that energy should be 0 , you can break the game with some energy that is not enough to continue.

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);



            if (energy >= distance ) {
               energy-=distance;
                wins++;
            } else {
                isWon = false;
                System.out.println(String.format("Not enough energy! Game ends with %d won battles and %d energy", wins, energy));
                return;
            }


            if (wins % 3 == 0) {
                energy += wins;
            }

            input = scanner.nextLine();
        }


        System.out.println(String.format("Won battles: %d. Energy left: %d", wins, energy));

    }
}
