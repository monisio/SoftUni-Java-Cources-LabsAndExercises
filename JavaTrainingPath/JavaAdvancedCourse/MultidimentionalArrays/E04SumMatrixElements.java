package JavaAdvancedCourse.MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }


        System.out.println(matrix.length+System.lineSeparator()+matrix[0].length+System.lineSeparator()+sum);

    }


    private static int[][] getMatrix(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[input[0]][input[1]];
        for (int i = 0; i < input[0]; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = array;

        }

        return matrix;
    }
}
