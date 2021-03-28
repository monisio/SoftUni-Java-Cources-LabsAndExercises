package JavaProgramingBasicsCourse.ChecksExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int minutesPlus = minutes + 15;   // input + 15

        int hoursPlus = 0;

        if (minutesPlus > 59) {
            hoursPlus = hours + 1;
            minutesPlus = minutesPlus - 60;


        } else {
            hoursPlus = hours;
        }


        if (hoursPlus >= 24) {
            hoursPlus = hoursPlus - 24;
        }


        if (minutesPlus >= 10) {
            System.out.println(hoursPlus + ":" + minutesPlus);
        } else {
            System.out.printf(hoursPlus + ":" + "0%d", minutesPlus);
        }

    }

}