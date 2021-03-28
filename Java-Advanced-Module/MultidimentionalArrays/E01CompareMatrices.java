package AdvancedJava.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[][] matrixA = getMatrix(scanner);
        int[][] matrixB = getMatrix(scanner);


        boolean areEqual = matrixA.length == matrixB.length;

        if (areEqual) {

            for (int row = 0; row < matrixA.length; row++) {
                areEqual = matrixA[row].length == matrixB[row].length;

                if (areEqual) {
                    for (int cols = 0; cols < matrixA[row].length; cols++) {
                        int a = matrixA[row][cols];
                        int b = matrixB[row][cols];
                        areEqual = a == b;

                        if (!areEqual) {
                            break;
                        }
                    }
                }


                if (!areEqual) {
                    break;
                }
            }
        }


        String output = areEqual ? "equal" : "not equal";

        System.out.println(output);

    }

    private static int[][] getMatrix(Scanner scanner) {
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i <input[0] ; i++) {
            int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix[i]=array;

        }

        return matrix;
    }


}
