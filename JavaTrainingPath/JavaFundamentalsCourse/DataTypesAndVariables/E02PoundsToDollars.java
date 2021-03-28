package JavaFundamentalsCourse.DataTypesAndVariables;

import java.util.Scanner;

public class E02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pounds = Integer.parseInt(scanner.nextLine());


         double dolars =  pounds * 1.31;

        System.out.printf("%.3f",dolars);

    }
}
