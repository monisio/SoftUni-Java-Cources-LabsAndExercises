package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E07NxNmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        printMatrix (number);



    }

    private static void printMatrix(int number) {

        for (int i = 1; i <=number ; i++) {

            for (int j = 1; j <=number ; j++) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
