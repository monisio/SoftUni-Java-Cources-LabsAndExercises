package JavaAdvancedCourse.MultidimentionalArrays.Exsercise;

import java.util.Scanner;

public class E02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();


        String [][] palindromesMatrix = new String[r][c];
        char current = 'a';
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c ; j++) {
                palindromesMatrix[i][j]=String.format("%c%c%c",current,current+j,current);

            }
            current++;
        }

     printMatrix(palindromesMatrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] byTwoMatrix : matrix) {
            for (String twoMatrix : byTwoMatrix) {
                System.out.print(twoMatrix+ " ");
            }
            System.out.println();
        }
    }
}
