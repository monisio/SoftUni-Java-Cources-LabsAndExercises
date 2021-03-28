package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());




        double sum = (lightSaberPrice * Math.ceil(studentsCount * 1.1)) + (robesPrice * studentsCount) + (beltPrice * studentsCount);



        if (studentsCount / 6 != 0) {
            double  discount = (studentsCount / 6) * beltPrice;
            sum -= discount;
        }

        String output = "";

        if (sum <= money) {
            output = String.format("The money is enough - it would cost %.2flv.", sum);
        } else {
            output = String.format("Ivan Cho will need %.2flv more.", sum - money);
        }

        System.out.println(output);
    }
}
