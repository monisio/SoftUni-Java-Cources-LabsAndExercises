package JavaProgramingBasicsCourse.WhileLoopsExcercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



         double input = Double.parseDouble(scanner.nextLine());

         double calc = input* 100;

        int coins = (int) calc;


        int count = 0;
        boolean isEmpty = false;

        while (!isEmpty) {

            if (coins >= 200) {
                coins -= 200;
            } else if (coins >= 100) {
                coins -= 100;
            } else if (coins >= 50) {
                coins -= 50;
            } else if (coins >= 20) {
                coins -= 20;
            } else if (coins >= 10) {
                coins -= 10;
            } else if (coins >= 5) {
                coins -= 5;
            } else if (coins >= 2) {
                coins -= 2;
            } else if (coins >= 1) {
                coins -= 1;
            }

            count++;

            if (coins == 0) {
                isEmpty = true;
            }


        }

        System.out.println(count);
    }
}
