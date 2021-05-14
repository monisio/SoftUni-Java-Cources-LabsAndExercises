package JavaOOPCourse.WorkingWithAbstraction.E01RombusOfStars;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int rows = 0; rows <= n ; rows++) {
            printRow(n, rows);
        }

        for (int i = n-1; i > 0 ; i--) {
            printRow(n, i);
        }

    }

    private static void printRow(int times, int rowNumber) {

        printWhiteSpace(times, rowNumber);
        printStar(rowNumber);

        System.out.println();
    }

    private static void printStar(int rowNumber) {
        for (int cols = 0; cols < rowNumber; cols++) {
            System.out.print("* ");
        }
    }

    private static void printWhiteSpace(int times, int rowNumber) {
        for (int i = times - rowNumber; i > 0  ; i--) {
            System.out.print(" ");
        }
    }


}
