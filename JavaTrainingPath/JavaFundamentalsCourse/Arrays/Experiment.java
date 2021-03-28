package JavaFundamentalsCourse.Arrays;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int [n];
        for (int i = array.length -1 ; i >= 0 ; i--) {
            array[i]= scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
