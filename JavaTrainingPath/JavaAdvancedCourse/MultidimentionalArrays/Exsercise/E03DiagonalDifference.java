package JavaAdvancedCourse.MultidimentionalArrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [][] matrix = getMatrix(scanner, " ");




       int diagonalA = 0;
       int diagonalB = 0;

        for (int i = 0; i < matrix.length ; i++) {
            diagonalA += matrix[i][i];
            diagonalB += matrix[i][matrix.length-1-i];

        }

        System.out.println(Math.abs(diagonalA-diagonalB));

    }


    private static void printMatrix(int[][] matrix) {
        for (int[] byTwoMatrix : matrix) {
            for (int twoMatrix : byTwoMatrix) {
                System.out.print(twoMatrix+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix(Scanner scanner ,String pattern  ) {
        int rows = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            int[] array = readArray(scanner,pattern);

            matrix[i] = array;

        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner , String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern)).mapToInt(Integer::parseInt).toArray();
    }
}
