package Fundamentals.Arrays.Exsercise;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputA = scanner.nextLine();
        String [] arrayA = inputA.split(" ");

        String inputB = scanner.nextLine();
        String [] arrayB = inputB.split(" ");

        for (int i = 0; i < arrayB.length; i++) {


            for (int j = 0; j < arrayA.length; j++) {

               if (arrayB [i].equals(arrayA [j])  ){
                   System.out.print(arrayB[i] +" ");
               }

            }
        }

    }
}
