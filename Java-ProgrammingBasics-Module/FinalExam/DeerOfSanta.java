package FinalExam;

import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int availableFood = Integer.parseInt(scanner.nextLine());
        double firstDeer = Double.parseDouble(scanner.nextLine());
        double secondDeer = Double.parseDouble(scanner.nextLine());
        double thirdDeer = Double.parseDouble(scanner.nextLine());


      firstDeer *=days ;
      secondDeer *= days;
      thirdDeer *= days;

      Double food = Math.floor(availableFood - (firstDeer+ secondDeer + thirdDeer));


      if ( food >= 0){
          System.out.printf("%.0f kilos of food left.",food );
      } else {
          System.out.printf("%.0f more kilos of food are needed.",Math.abs(food));
      }



    }
}
