package AdvancedJava.MultidimentionalArrays.Exsercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationInfo = scanner.nextLine();
        int rotationDegree = Integer.parseInt(rotationInfo.substring(rotationInfo.indexOf("(") + 1, rotationInfo.indexOf(")")));

        String input = scanner.nextLine();

        List<String> inputLines = new ArrayList<>();


        int matrixSize = 0;

        while (!input.equals("END")) {

            inputLines.add(input);


            if (input.length() > matrixSize) {
                matrixSize = input.length();
            }


            input = scanner.nextLine();
        }


        char[][] matrix = getInputToMatrix(inputLines, matrixSize);


        rotationDegree = rotationDegree % 360;


        if (rotationDegree != 0) {

            if (rotationDegree == 90) {
                rotateMatrix90(matrix);
            } else if (rotationDegree == 180) {
                rotateMatrix180(matrix);
            } else if (rotationDegree == 270) {
                rotateMatrix270(matrix);
            }

        } else {
            printMatrix(matrix);
        }


    }


    private static void printMatrix(char[][] matrix) {
        for (char[] byTwoMatrix : matrix) {
            for (char twoMatrix : byTwoMatrix) {
                System.out.print(twoMatrix);
            }
            System.out.println();
        }
    }

    private static void rotateMatrix270(char[][] matrix) {

        for (int i = matrix[0].length - 1; i >= 0; i--) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]);

            }
            System.out.println();
        }

    }

    private static void rotateMatrix180(char[][] matrix) {

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static void rotateMatrix90(char[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {

            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }


    }


    private static char[][] getInputToMatrix(List<String> inputLines, int matrixSize) {

        char[][] matrix = new char[inputLines.size()][matrixSize];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                try {
                    matrix[i][j] = inputLines.get(i).charAt(j);
                } catch (Exception e) {
                    matrix[i][j] = ' ';
                }


            }


        }

        return matrix;
    }

}
