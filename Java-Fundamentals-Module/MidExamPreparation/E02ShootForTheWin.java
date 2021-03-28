package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class E02ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] shootingRange = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        int counter = 0;

        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);

            if (shotIndex >= 0 && shotIndex < shootingRange.length ) {
                int currentShotTarget = shootingRange[shotIndex];

                if (currentShotTarget != -1) {
                    shootingRange[shotIndex] =-1;
                    counter++;
                }

                for (int i = 0; i < shootingRange.length ; i++) {
                    int currentTarget = shootingRange[i];

                    if (currentTarget!=-1){

                        if(currentTarget>currentShotTarget){
                            shootingRange[i]-=currentShotTarget;
                        }else{
                            shootingRange[i]+=currentShotTarget;
                        }
                    }

                }

            }


            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ",counter);

        for (int i : shootingRange) {
            System.out.print(i+" ");

        }

    }
}
