package AdvancedJava.MultidimentionalArrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner, " ");

        int[][] resultMatrix= new int[3][3];
        int sum = Integer.MIN_VALUE;

        for (int outerRow = 0; outerRow <matrix.length - 2  ; outerRow++) {
            for (int outerCol = 0; outerCol < matrix[0].length - 2 ; outerCol++) {
                int[][] temporary = new  int[3][3];
                int sumCurrent = 0;

                for (int innerRow = outerRow; innerRow < outerRow+3 ; innerRow++) {
                    for (int innerCol = outerCol; innerCol < outerCol+3; innerCol++) {

                        int number = matrix[innerRow][innerCol];
                        sumCurrent+= number;
                        temporary[innerRow-outerRow][innerCol-outerCol]= number;




                    }
                }

                if (sumCurrent>sum){
                    sum= sumCurrent;
                    resultMatrix = temporary;
                }

            }
        }

        System.out.println("Sum = "+sum);
        printMatrix(resultMatrix);
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
                System.out.print(twoMatrix+ " ");
            }
            System.out.println();
        }
    }

}
