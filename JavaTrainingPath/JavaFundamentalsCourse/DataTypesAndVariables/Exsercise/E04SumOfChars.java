package JavaFundamentalsCourse.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            String a = scanner.nextLine();
            int index = a.charAt(0);

            sum+= index;


        }

        System.out.printf("The sum equals: %d", sum);


    }
}
