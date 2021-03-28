package JavaProgramingBasicsCourse.FinalExam;

import java.util.Scanner;

public class CristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int paperRolls = Integer.parseInt(scanner.nextLine());
        int clothRolls = Integer.parseInt(scanner.nextLine());
        double glueLiters = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());



        double account = (paperRolls * 5.80) + (clothRolls * 7.20) + (glueLiters * 1.20);

        double discount = (account / 100) * discountPercent;

        System.out.printf("%.3f", account - discount);


    }
}
