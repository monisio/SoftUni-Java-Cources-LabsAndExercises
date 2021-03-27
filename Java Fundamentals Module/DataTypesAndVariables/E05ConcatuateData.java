package Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class E05ConcatuateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String sign = scanner.nextLine();

        System.out.println(nameOne+sign+nameTwo);

    }
}
