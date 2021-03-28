package TestPreparation;

import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());




        double videoSum = N * 250;
        double procesorSum = M * (videoSum * 0.35);
        double ramSum = P * (videoSum * 0.10);

        double finalSum = videoSum+procesorSum+ramSum;

        if (N > M){
            finalSum *= 0.85;
        }

        if(budget<finalSum){
            System.out.printf("Not enough money! You need %.2f leva more!",finalSum - budget);
        }else {
            System.out.printf("You have %.2f leva left!",budget-finalSum);
        }

    }
}
