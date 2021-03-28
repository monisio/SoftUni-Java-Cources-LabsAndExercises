package JavaProgramingBasicsCourse.Checks;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        //Можем да създадем променлива
        // double area = 0.0

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double result = side * side;
            System.out.printf("%.3f", result);
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            // area = sideA * sideB; за всяко изчисление.
            double result = sideA * sideB;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double result = Math.PI * radius * radius;
            System.out.printf("%.3f", result);
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double result = (side * height) / 2;
            System.out.printf("%.3f",result);

        }

        // System.out.printf ( "%.3f",area)
    }
}
