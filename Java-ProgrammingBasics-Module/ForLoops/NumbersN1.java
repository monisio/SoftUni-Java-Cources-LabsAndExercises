package ForCycles;

import java.util.Scanner;

public class NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for ( int i = N ; i <=100 ; i +=2){
            System.out.println(i);
        }


    }
}
