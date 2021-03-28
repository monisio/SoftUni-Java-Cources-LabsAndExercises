package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();

       double   courseTimes = Math.ceil((double) n / p);



        System.out.print( (int)courseTimes);


    }
}
