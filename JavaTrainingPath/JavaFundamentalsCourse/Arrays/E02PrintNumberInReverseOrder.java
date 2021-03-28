package JavaFundamentalsCourse.Arrays;

import java.util.Scanner;

public class E02PrintNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] numbers = new int[n];

        for (int i = 0; i < numbers.length ; i++) {

            int input = scanner.nextInt();
            numbers [i]= input;


        }


        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i] +" ");
        }


    }
}
