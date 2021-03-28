package AdvancedJava.MultidimentionalArrays.Exsercise;

import java.util.Arrays;
import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] matrixInfo = scanner.nextLine().split("\\s+");
        int size = Integer.parseInt(matrixInfo[0]);
        int [][]  matrix = getMatrix(Integer.parseInt(matrixInfo[0]),Integer.parseInt(matrixInfo[1]));

        String input = scanner.nextLine();


        while (input.equals("Nuke it from orbit")){

            int [] coordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int rows = coordinates[0];
            int cols = coordinates[1];
            int radius = coordinates[2];


             matrix[rows][cols]=0;

             for (int i = 1; i < radius; i++) {
                matrix[rows-i][cols]=0;
                matrix[rows+i][cols]=0;
                matrix[rows][cols-i]=0;
                matrix[rows][cols+i]=0;
            }

            int[][] matrixCurrent = new int [size][];


        }


    }



    private static int[][] getMatrix(int cols ,int rows) {
        int[][] a = new int[cols][rows];

        int number = 1;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                a[j][i] = number++;

            }
        }
        return a;

    }
}
