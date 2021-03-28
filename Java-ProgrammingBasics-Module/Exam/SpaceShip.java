package Exam;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // whod

        double widhtShip = Double.parseDouble(scanner.nextLine());
        double lenghtShip = Double.parseDouble(scanner.nextLine());
        double hightShip = Double.parseDouble(scanner.nextLine());
        double astrounautHeight = Double.parseDouble(scanner.nextLine());

        double shipVolume = widhtShip * lenghtShip * hightShip;
        double roomVolume = (astrounautHeight + 0.40) * 2 * 2;

        double personsFitIn = Math.floor(shipVolume / roomVolume);


        if (personsFitIn >= 3 && personsFitIn <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.",personsFitIn);
        }else if (personsFitIn <3){
            System.out.printf("The spacecraft is too small.");

        }else if (personsFitIn>10){
            System.out.printf("The spacecraft is too big.");
        }

    }
}
