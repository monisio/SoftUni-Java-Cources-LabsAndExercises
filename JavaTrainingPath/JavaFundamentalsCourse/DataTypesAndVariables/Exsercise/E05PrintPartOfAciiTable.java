package JavaFundamentalsCourse.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E05PrintPartOfAciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indexStart = Integer.parseInt(scanner.nextLine());
        int indexEnd = Integer.parseInt(scanner.nextLine());


        for (int i = indexStart; i <= indexEnd; i++) {

            char a = (char) i;


            System.out.print(a +" ");

        }

    }
}
