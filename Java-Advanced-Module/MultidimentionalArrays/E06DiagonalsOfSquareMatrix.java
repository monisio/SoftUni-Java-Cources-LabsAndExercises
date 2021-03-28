package AdvancedJava.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E06DiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [][] matrix = getMatrix(scanner," ");


        int rows = 0, cols = 0;

        while(cols < matrix.length){
            System.out.print(matrix[rows++][cols++]+" ");
        }
        System.out.println();

        rows=matrix.length-1;
        cols=0;
        while (rows>=0){
            System.out.print(matrix[rows--][cols++]+" ");
        }

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
