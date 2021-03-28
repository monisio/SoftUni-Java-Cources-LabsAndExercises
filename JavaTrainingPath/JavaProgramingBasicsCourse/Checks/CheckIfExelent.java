package JavaProgramingBasicsCourse.Checks;

import java.util.Scanner;

public class CheckIfExelent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());

        boolean check = score >= 5;

        if (check) {
            System.out.println("Excellent!");
        }
    }
}
