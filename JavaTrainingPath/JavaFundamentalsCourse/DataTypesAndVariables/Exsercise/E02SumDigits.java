package JavaFundamentalsCourse.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int length = input.length();


        int sum = 0;

        for (int i = 0; i < length; i++) {
            int current = Integer.parseInt(String.valueOf(input.charAt(i)));

            sum += current;

        }

        System.out.println(sum);

    }
}
