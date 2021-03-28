package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        // : baby, child, teenager, adult, elder.

        if (age >= 0 && age <= 2) {
            System.out.println("baby");

        } else if (age >= 3 && age <= 13) {
            System.out.println("child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        } else if (age > 65){
            System.out.println("elder");

        }else {
            System.out.println("invalid number");
        }
    }
}
