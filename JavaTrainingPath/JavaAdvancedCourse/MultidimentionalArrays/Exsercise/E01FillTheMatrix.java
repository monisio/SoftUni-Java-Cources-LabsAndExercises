package JavaAdvancedCourse.MultidimentionalArrays.Exsercise;

import java.util.Scanner;

public class E01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String type = input[1];


        int[][] matrix = type.equals("A") ? getMatrixA(n) : getMatrixB(n);

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] byTwoMatrix : matrix) {
            for (int twoMatrix : byTwoMatrix) {
                System.out.print(twoMatrix+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrixB(int size) {
        int[][] b = new int[size][size];

        int number = 1;
        int flips = 0;
        for (int i = 0; i < size; i++) {
            flips++;
            for (int j = 0; j < size; j++) {

               if (flips %2 != 0 ){
                   b[j][i] = number++;
               }else{
                  int current = size-1 - j;
                   b[current][i] = number++;
               }

            }
        }
        return b;

    }

    private static int[][] getMatrixA(int size) {
        int[][] a = new int[size][size];

        int number = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[j][i] = number++;

            }
        }
        return a;

    }
}
