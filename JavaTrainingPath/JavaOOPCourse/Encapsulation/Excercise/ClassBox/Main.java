package JavaOOPCourse.Encapsulation.Excercise.ClassBox;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        try {

            Box box = new Box(length, width, height);
            DecimalFormat df = new DecimalFormat();

            System.out.println("Surface Area - " + df.format(box.calculateSurfaceArea()));
            System.out.println("Lateral Surface Area - " + df.format(box.calculateSurfaceArea()));
            System.out.println("Volume - " + df.format(box.calculateVolume()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
