package AdvancedJava.MultidimentionalArrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E05MatrixShufflingTryCatchExceptionUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner, " ");

        String input = scanner.nextLine();


        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            try {                   // try catch exception  по този начин предотратяваме краш на програмата като улавяме грешката и изпълняваме заместващо парче код.
                int a = matrix[Integer.parseInt(tokens[1])][Integer.parseInt(tokens[2])];
                int b = matrix[Integer.parseInt(tokens[3])][Integer.parseInt(tokens[4])];
                matrix[Integer.parseInt(tokens[1])][Integer.parseInt(tokens[2])] = b;
                matrix[Integer.parseInt(tokens[3])][Integer.parseInt(tokens[4])] = a;

                printMatrix(matrix);

            } catch (Exception e) {
                System.out.println("Invalid input!");
            }


            input = scanner.nextLine();
        }


    }

    private static int[][] getMatrix(Scanner scanner, String pattern) {
        int[] input = readArray(scanner, pattern);

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i < input[0]; i++) {
            int[] array = readArray(scanner, pattern);

            matrix[i] = array;

        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern)).mapToInt(Integer::parseInt).toArray();
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] byTwoMatrix : matrix) {
            for (int twoMatrix : byTwoMatrix) {
                System.out.print(twoMatrix + " ");
            }
            System.out.println();
        }
    }
}
