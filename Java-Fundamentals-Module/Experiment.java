package Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Experiment {
    static class Dice {
        int side;

        public Dice() {
            this.side = 6;
        }


        public Dice(int side) {

            this.side = side;
        }

       static int roll(int side) {
            Random roll = new Random();
            side = roll.nextInt(side + 1);
            return side;

        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sides = scanner.nextInt();



        int a = Dice.roll(sides);

        System.out.println(a);


    }
}
