package JavaFundamentalsCourse.DataTypesAndVariables;

import java.util.Scanner;

public class E01MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = (double) meters / 1000;

        System.out.printf("%.2f",kilometers);
    }
}
