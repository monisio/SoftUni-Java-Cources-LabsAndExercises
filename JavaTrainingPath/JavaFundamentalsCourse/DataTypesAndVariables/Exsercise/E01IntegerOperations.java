package JavaFundamentalsCourse.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int operations = ((a+b)/c) * d;

        System.out.println(operations);

    }
}
