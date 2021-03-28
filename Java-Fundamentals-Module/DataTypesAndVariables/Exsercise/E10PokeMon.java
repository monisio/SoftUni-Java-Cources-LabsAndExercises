package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long pokePower = scanner.nextInt();
        int distance = scanner.nextInt();
        int exhaustionFactor = scanner.nextInt();


        double currentPokePower = pokePower;
        int targetsCount =0;


        while (currentPokePower >= distance) {



            if ( currentPokePower == pokePower* 0.5 && exhaustionFactor != 0){

                pokePower /= exhaustionFactor;
                continue;

            }
            currentPokePower -=distance ;

            targetsCount ++;
        }





        System.out.println(currentPokePower);
        System.out.println(targetsCount);

    }
}
