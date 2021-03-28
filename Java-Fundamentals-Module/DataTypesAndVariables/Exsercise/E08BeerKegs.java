package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String biggerKeg = "";

        double size = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * (Math.pow(radius, 2)) * height;

            if (volume > size) {
                biggerKeg = model;
                size = volume;
            }


        }

        System.out.println(biggerKeg);


    }
}
