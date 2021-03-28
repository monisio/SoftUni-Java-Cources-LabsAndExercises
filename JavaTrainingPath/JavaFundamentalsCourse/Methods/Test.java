package JavaFundamentalsCourse.Methods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        char a = inputA.charAt(0);
        char b = inputB.charAt(0);




        for (int i = a;i <=b;i++) {
            char current = (char) i;

            System.out.print(current+" ");
        }


    }
}
