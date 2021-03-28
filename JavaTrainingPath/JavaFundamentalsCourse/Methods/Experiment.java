package JavaFundamentalsCourse.Methods;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(fibbionaci (n));
    }


    public static int fibbionaci (int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else {
            return fibbionaci(n-1)+ fibbionaci(n-2);
        }


    }


}
