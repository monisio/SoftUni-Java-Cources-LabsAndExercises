package JavaProgramingBasicsCourse.FinalExam;

import java.util.Scanner;

public class HairSaloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int target = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int moneySum = 0;
        boolean isReachedTarget = false;

        while (!input.equals("closed")) {

            String type = scanner.nextLine();

            if (input.equals("haircut")) {

                if (type.equals("mens")) {
                    moneySum += 15;
                } else if (type.equals("ladies")) {
                    moneySum += 20;
                } else if (type.equals("kids")) {
                    moneySum += 10;
                }


            } else if (input.equals("color")) {

                if (type.equals("touch up")) {
                    moneySum += 20;
                } else if (type.equals("full color")) {
                    moneySum += 30;
                }
            }

            if(moneySum>=target){
                isReachedTarget = true;
                break;
            }


            input = scanner.nextLine();
        }




        if(isReachedTarget){
            System.out.printf("You have reached your target for the day!%n");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n",target - moneySum);

        }

        System.out.printf("Earned money: %dlv.",moneySum);



    }
}
