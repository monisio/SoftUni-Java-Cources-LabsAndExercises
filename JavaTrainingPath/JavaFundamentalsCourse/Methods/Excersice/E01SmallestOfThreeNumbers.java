package JavaFundamentalsCourse.Methods.Excersice;

import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int smallestNumber = Integer.MAX_VALUE;


        for (int i = 0; i < 3 ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            smallestNumber = getSmallestNumber(currentNumber , smallestNumber);

        }

        System.out.print(smallestNumber);

    }

    private static int getSmallestNumber(int a , int b) {

        if (a<b){
            return a;
        }

        return b;


    }


}
