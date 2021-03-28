package JavaFundamentalsCourse.BasicSyntaxExcercise;

import java.util.Scanner;

public class TimeIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes  = scanner.nextInt();

        int calc = (hours * 60 + minutes)+30;

        int hoursSum = calc / 60;
        int minutesSum = calc % 60;




        System.out.printf("%d:%02d",hoursSum, minutesSum);
    }
}
