package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());

        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashed = lostGameCount / 2;
        int mouseTrashed = lostGameCount / 3;
        int keyBoardTrashed = lostGameCount / 6;
        int displayTrashed = keyBoardTrashed / 2;


        double totalExpenses = (headsetTrashed * headSetPrice) + (mouseTrashed * mousePrice) + (keyBoardTrashed * keyboardPrice) + (displayTrashed * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);


    }
}
