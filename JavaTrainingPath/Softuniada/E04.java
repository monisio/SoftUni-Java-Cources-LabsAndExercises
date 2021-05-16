package Softuniada;

import java.util.Arrays;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        char[][] boxes = getMatrix(input[0], input[1], scanner);

        char symbolFound = scanner.nextLine().charAt(0);

        int[] startCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int initialR = startCoordinates[0];
        int initialC = startCoordinates[1];

        char initialSymbol = boxes[initialR][initialC];

        boxes[initialR][initialC] = symbolFound;

        //- означени със същия като началния символ (initialSymbol)
        //	И
        //	- могат да бъдат достигнати лесно от началната кутия - нагоре (ред - 1), надолу (ред + 1), ляво (колона - 1),
        //	дясно (колона + 1) и ако са означени със същия като началния символ (initialSymbol)

         boolean isEggfound = true;
        for (int i = initialR; i < input[0]; i++) {
            boolean flag = true;

            for (int j = initialC; j < input[1]; j++) {

                boolean isFound = false;

                if (i - 1 >= 0) {
                    char checkUp = boxes[i - 1][j];
                    if (checkUp == initialSymbol) {
                        boxes[i - 1][j] = symbolFound;
                        isFound = true;
                    }

                }

                if (i + 1 < input[0]) {
                    char checkDown = boxes[i + 1][j];
                    if (checkDown == initialSymbol) {
                        boxes[i + 1][j] = symbolFound;
                        isFound = true;
                    }

                }
                if (j - 1 >= 0) {
                    char checkLeft = boxes[i][j - 1];

                    if (checkLeft == initialSymbol) {
                        boxes[i][j - 1] = symbolFound;
                        isFound= true;
                    }
                }
                if (j + 1 < input[1]) {
                    char checkRight = boxes[i][j + 1];
                    if (checkRight == initialSymbol) {
                        boxes[i][j + 1] = symbolFound;
                        isFound = true;
                    }

                }

                if (!isFound) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }

        }


        printMatrix(boxes);


    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (int col : row) {
                System.out.print((char) col);
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