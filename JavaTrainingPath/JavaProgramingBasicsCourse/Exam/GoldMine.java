package JavaProgramingBasicsCourse.Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int locationsAmount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= locationsAmount; i++) {

            double expectedGoldAmount = Double.parseDouble(scanner.nextLine());
            int daysDigging = Integer.parseInt(scanner.nextLine());

            double goldGathered = 0.0;


            for (int j = 1; j <= daysDigging; j++) {
                double gold = Integer.parseInt(scanner.nextLine());


                goldGathered += gold;


            }

            double goldAverage = goldGathered / daysDigging;



            if (goldAverage >= expectedGoldAmount) {
                System.out.printf("Good job! Average gold per day: %.2f.%n",goldAverage);

            } else{
                System.out.printf("You need %.2f gold.%n", expectedGoldAmount - goldAverage  );
            }


        }


    }
}
