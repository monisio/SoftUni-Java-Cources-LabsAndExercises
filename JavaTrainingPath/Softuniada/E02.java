package Softuniada;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i > 0; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.print(i);

            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }


            System.out.println();
        }


    }
}
