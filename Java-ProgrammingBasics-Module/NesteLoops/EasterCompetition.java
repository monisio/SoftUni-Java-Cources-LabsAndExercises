package NestedCycles;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // wunchen cikul for ; sled towa wutreshen

        int cakesAmount = Integer.parseInt(scanner.nextLine());


        int scoreSum = 0;

        String leaderName = "";
        int leaderScore = Integer.MIN_VALUE;

        for (int i = 0; i < cakesAmount; i++) {
            String bakerName = scanner.nextLine();
            String input = scanner.nextLine();


            while (!input.equals("Stop")) {

                int score = Integer.parseInt(input);

                scoreSum += score;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, scoreSum);
            if (scoreSum > leaderScore) {
                leaderScore = scoreSum;
                leaderName = bakerName;

                System.out.printf("%s is the new number 1!%n",leaderName);
            }
            scoreSum = 0;
        }

        System.out.printf("%s won competition with %d points!",leaderName,leaderScore);

    }
}
