package JavaAdvancedCourse.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class E04AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addVat = d -> d * 1.20;

        String inputLine = scanner.nextLine();

        System.out.println("Prices with VAT:");

        Arrays.stream(inputLine.split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(d -> System.out.printf("%.2f%n", d));


    }
}
