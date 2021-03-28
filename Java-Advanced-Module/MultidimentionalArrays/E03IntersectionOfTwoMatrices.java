package AdvancedJava.MultidimentionalArrays;

import java.util.Scanner;

public class E03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] a = getMatrix(rows, cols, scanner);
        char[][] b = getMatrix(rows, cols, scanner);

        char[][] finalMatrix = new char[rows][cols];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                char one = a[row][col];
                char two = b[row][col];
                if (one == two) {
                    finalMatrix[row][col] = one;
                } else {
                    finalMatrix[row][col] = '*';
                }

                System.out.print(finalMatrix[row][col] + " ");

            }
            System.out.println();
        }


    }


    private static char[][] getMatrix(int rows, int cols, Scanner scanner) {


        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            char[] array = scanner.nextLine().replaceAll(" ", "").toCharArray();

            matrix[i] = array;

        }

        return matrix;
    }
}
