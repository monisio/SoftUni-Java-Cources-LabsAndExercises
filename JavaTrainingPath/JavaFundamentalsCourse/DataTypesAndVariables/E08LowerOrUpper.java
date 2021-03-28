package JavaFundamentalsCourse.DataTypesAndVariables;

import java.util.Scanner;

public class E08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char index = scanner.nextLine().charAt(0);



        if (index >= 65 && index <= 90) {
            System.out.println("upper-case");
        } else if (index >= 97 && index <= 122) {

            System.out.println("lower-case");
        }


    }
}
