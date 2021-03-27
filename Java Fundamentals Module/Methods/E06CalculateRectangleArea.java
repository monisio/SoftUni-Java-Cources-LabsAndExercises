package Fundamentals.Methods;


import java.util.Scanner;

public class E06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double width  = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = getRectangleArea(width, length);
        System.out.printf ("%.0f" ,area);
    }





    public static double getRectangleArea(double width, double length) {

        return width * length;

    }
}
