package JavaProgramingBasicsCourse.AdvanceChecksExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int testHour = Integer.parseInt(scanner.nextLine());
        int testMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());


        int testTime = testHour * 60 + testMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinutes;

        int calc = testTime - arrivalTime;

        String output = "";
        String outputLine = "";


        if (calc < 0) {
            output = "Late";

            if (calc >= -59) {
                outputLine = String.format("%d minutes after the start", Math.abs(calc));
            } else {
                outputLine = String.format("%d:%02d hours after the start",Math.abs(arrivalHour - testHour) , Math.abs(arrivalMinutes - testMinute));
            }

        } else if (calc > 0) {

            if (calc <= 30) {
                output = "On time";
                outputLine = String.format("%d minutes before the start", Math.abs(calc));
            }


            if (calc > 30) {
                output = "Early";

                if (calc <= 59) {
                    outputLine = String.format("%d minutes before the start", Math.abs(calc));
                } else {
                    outputLine = String.format("%d:%02d hours before the start", Math.abs(testHour - arrivalHour) , Math.abs(testMinute - arrivalMinutes));
                }

            }

        } else {
            output = "On time";

        }

        System.out.println(output);
        System.out.println(outputLine);


    }
}
