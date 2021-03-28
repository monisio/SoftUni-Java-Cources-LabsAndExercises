package ChecksExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int timeTotal = timeFirst + timeSecond + timeThird;
        int minutes = timeTotal / 60;
        int secounds = timeTotal % 60;
        if (secounds >= 10) {
            System.out.println(minutes + ":" + secounds);
        } else {
            System.out.printf(minutes + ":" + "0%d", secounds);
        }


    }
}
