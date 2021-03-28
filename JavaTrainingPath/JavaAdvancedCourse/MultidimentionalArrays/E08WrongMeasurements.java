package JavaAdvancedCourse.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][]matrix = getMatrix(scanner, size, " ");

        int [] position = readArray(scanner ," ");

        int wrongMeasurement = matrix[position[0]] [position[1]];

        for (int row = 0; row <size ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {

                if (matrix[row][col]==wrongMeasurement){
                    int up = row-1>=0 ? matrix[row-1][col] : 0;
                     up =  up!=wrongMeasurement ? up: 0;
                    int down = row+1<size ? matrix[row+1][col] : 0;
                     down =  down!=wrongMeasurement ? down : 0;
                    int left = col-1>=0 ? matrix[row][col-1] : 0;
                     left = left!=wrongMeasurement ? left: 0;
                    int right = col+1<matrix[row].length ? matrix[row][col+1]: 0;
                     right = right!=wrongMeasurement ? right: 0;
                    System.out.print((up+down+left+right) + " ");

                }else{
                    System.out.print(matrix[row][col]+ " ");
                }


            }
            System.out.println();
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
        int[] input = readArray(scanner ,pattern);

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i < input[0]; i++) {
            int[] array = readArray(scanner,pattern);

            matrix[i] = array;

        }

        return matrix;
    }

    private static int[][] getMatrix(Scanner scanner, int size , String pattern  ) {

        int[][] matrix = new int[size][];
        for (int i = 0; i < size; i++) {
            int[] array = readArray(scanner,pattern);

            matrix[i] = array;

        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner , String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern)).mapToInt(Integer::parseInt).toArray();
    }
}

