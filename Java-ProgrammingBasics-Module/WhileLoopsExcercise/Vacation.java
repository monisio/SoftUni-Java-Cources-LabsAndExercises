package WhileLoopsExcercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());

        double money = Double.parseDouble(scanner.nextLine());

        int countSpend = 5;
        int dayCount = 0;



        while (money < vacationPrice) {

            String command = scanner.nextLine();
            double inputSum = Double.parseDouble(scanner.nextLine());

            if (command.equals("spend")) {
                countSpend--;
                dayCount++;
                money = money - inputSum;
            }

            if (countSpend ==0){
                break;
            }

             if (command.equals("save")) {
                countSpend = 5;
                 dayCount++;
                 money = money + inputSum;
            }

             if (money<0) {
                 money = 0;

             }



        }

        if(countSpend==0){
            System.out.println("You can't save the money.");
            System.out.println(dayCount);
        }else{
            System.out.printf("You saved the money for %d days.",dayCount);
        }

    }
}
