package JavaProgramingBasicsCourse.Exam;

import java.util.Scanner;

public class CristmassGift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        int kidCount = 0;
        int adultCount = 0;

        int toysCount = 0;
        int sweetersCount = 0;

        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);

            if(age <=16){
                kidCount++;
                toysCount++;
            }else {
                adultCount++;
                sweetersCount++;
            }



            input= scanner.nextLine();

        }

        int toysPrice = toysCount * 5;
        int sweeterPrice = sweetersCount * 15;

        System.out.printf("Number of adults: %d%n",adultCount);
        System.out.printf("Number of kids: %d%n",kidCount);
        System.out.printf("Money for toys: %d%n",toysPrice);
        System.out.printf("Money for sweaters: %d",sweeterPrice);


    }
}
