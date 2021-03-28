package JavaFundamentalsCourse.Methods.Excersice;

import java.util.Scanner;

public class E03PrintCharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char start = a.charAt(0);
        char end = b.charAt(0);

        printLineOfCharacters(start,end);


    }

    private static void printLineOfCharacters(char start,char end ) {

        if (start<end){

            for (int i = start+1 ; i < end ; i++) {

                System.out.print((char)i+" ");

            }
        }else {

            for (int i = end+1; i < start; i++) {
                System.out.print((char)i+" ");
            }
        }


    }
}
