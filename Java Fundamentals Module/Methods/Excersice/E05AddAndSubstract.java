package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E05AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int add = add(a,b);

        System.out.println(subtract(add,c));
    }


    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
