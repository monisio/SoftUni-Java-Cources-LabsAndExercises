package Softuniada;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumOfAllBonuses = 0;

        while (!input.equals("stop")) {

            String name = input;
            int[] tasks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            int bonusTotal = 0;
            for (int i = 0; i < tasks.length; i++) {

                List<Integer> list = Arrays.stream(tasks).boxed().collect(Collectors.toList());

                list.remove(i);
                int bonus = 1;

                for (int j = 0; j < list.size(); j++) {
                    bonus*=list.get(j);
                }
                bonusTotal += bonus;
            }

            System.out.printf("%s has a bonus of %d lv.%n", name, bonusTotal);

            sumOfAllBonuses += bonusTotal;

            input = scanner.nextLine();
        }


        System.out.printf("The amount of all bonuses is %d lv.%n", sumOfAllBonuses);


    }
}
