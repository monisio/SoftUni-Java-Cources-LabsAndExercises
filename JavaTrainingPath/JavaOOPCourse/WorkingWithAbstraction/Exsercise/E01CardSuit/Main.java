package JavaOOPCourse.WorkingWithAbstraction.Exsercise.E01CardSuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*//        CardSuits[] values = CardSuits.values();
//
//        System.out.println("Card Suits:");
//        for (CardSuits value : values) {
//            System.out.printf("Ordinal value:%d ; Name value: %s%n", value.ordinal(),value.name());
//        }
        CardRanks[] ranks = CardRanks.values();*/

       /* System.out.println("Card Ranks:");
        for (CardRanks value : ranks) {
          System.out.printf("Ordinal value:%d ; Name value: %s%n", value.ordinal(),value.name());
      }
*/

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        int power = CardSuits.valueOf(suit).getSuitPower() + CardRanks.valueOf(rank).getPower();

        System.out.printf("Card Name:%s of %s; Card Power: %d",rank, suit ,power);

    }
}
