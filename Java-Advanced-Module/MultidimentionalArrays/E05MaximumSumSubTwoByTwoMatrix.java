package AdvancedJava.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E05MaximumSumSubTwoByTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = getMatrix(scanner,", ");

        int [][] twoByTwoMatrix = new  int[2][2];

        int sum = Integer.MIN_VALUE;
        int maxRows=0 , maxCols=0 ;  // можем да инициализираме няколко променливи от един и същи вид на един ред.

        for (int row = 0; row < matrix.length-1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                int a = matrix[row][col];
                int b = matrix[row][col+1];
                int c = matrix[row+1][col];
                int d = matrix[row+1][col+1];
                int sumCurrent = a+b+c+d;
                if(sum<sumCurrent){
                    sum = sumCurrent;
                    maxRows= row;
                    maxCols= col;
                   // twoByTwoMatrix = new int[][]{{a, b}, {c, d}};

                }


            }
        }
        // принтирането може да е с втора матрица или като вземем първите индекси и направим формула за извикване на елементите които ни трябват.
       // другия вариант е с фор цикъл в който итерираме данните.
        System.out.println(matrix[maxRows][maxCols]+" "+ matrix[maxRows][maxCols+1] );
        System.out.println(matrix[maxRows+1][maxCols]+" "+matrix[maxCols+1][maxCols+1]);

       // printMatrix(twoByTwoMatrix);
        System.out.println(sum);
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
        int[] input = readArray(scanner ,pattern);

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i < input[0]; i++) {
            int[] array = readArray(scanner,pattern);

            matrix[i] = array;

        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner , String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern)).mapToInt(Integer::parseInt).toArray();
    }
}
