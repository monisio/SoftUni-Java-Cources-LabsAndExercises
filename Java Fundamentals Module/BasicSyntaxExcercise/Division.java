package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        String output = "";
        int check = 0;

        if (number % 10 == 0) {

            check = 10;
        } else if (number % 7 == 0) {

            check = 7;

        } else if (number % 6 == 0) {

            check = 6;
        } else if (number % 3 == 0) {

            check = 3;
        } else if (number % 2 == 0) {

            check = 2;
        }


        if (check != 0) {
            output = String.format("The number is divisible by %d", check);
        }else{
            output = "Not divisible";
        }

        System.out.println(output);

    }
}
