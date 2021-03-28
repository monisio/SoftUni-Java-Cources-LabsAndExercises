package JavaProgramingBasicsCourse.ChecksExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        // cenata na dekora
        double decor = money * 0.1 ;


        if (statist > 150 ){
            outfitPrice = outfitPrice-(outfitPrice * 0.1);  // vqrno
        }

        double clothes = outfitPrice * statist; // za da sraboti se double-a se pishe sled uslovieto if

        double moneyNeeded = decor + clothes ;
        double budgetTotal = Math.abs(money - moneyNeeded) ;


        if (moneyNeeded > money){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs " + "%.2f" +" leva more.",budgetTotal);
        } else {  System.out.println("Action!");
            System.out.printf("Wingard starts filming with " + "%.2f" +" leva left.", budgetTotal);
        }

    }
}
