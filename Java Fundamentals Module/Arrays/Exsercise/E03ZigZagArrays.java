package Fundamentals.Arrays.Exsercise;

import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        int counter = 0;
        for (int i = 0; i < arrayA.length; i++) {
            counter++;
            int inputA = scanner.nextInt();
            int inputB = scanner.nextInt();

            if (counter % 2 == 0) {
                arrayA[i] = inputB;
                arrayB[i] = inputA;

            } else {
                arrayA[i] = inputA;
                arrayB[i] = inputB;
            }


        }


        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");

        }

        System.out.println();
        for (int i = 0; i <arrayA.length ; i++) {
            System.out.print(arrayB[i]+" ");
        }
    }


}
