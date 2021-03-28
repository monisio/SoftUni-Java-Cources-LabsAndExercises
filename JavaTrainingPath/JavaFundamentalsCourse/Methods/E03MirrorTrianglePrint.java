package JavaFundamentalsCourse.Methods;

import java.util.Scanner;

public class E03MirrorTrianglePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            printNumbers(i);


        }


        for (int i = n-1; i >= 1  ; i--) {
            printNumbers(i);

        }
    }


    static void printNumbers(int i){
        for (int j = 1; j <= i ; j++) {
            System.out.print(j);
            if (j < i){
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }


}
