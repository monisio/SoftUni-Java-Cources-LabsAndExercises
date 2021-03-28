package AdvanceChecksExercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testHour = Integer.parseInt(scanner.nextLine());
        int testMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());


        int testTime = testHour * 60 + testMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinutes;

        int calc = testTime - arrivalTime;

        //pri po malko ot 0 zakusnqwam po golqmo ot 0 podranqwame

        String output="";
        String outputLine ="";

        if (testHour < arrivalHour && calc !=0 ) {
            output = "Late";

            if (calc <= -60) {
                outputLine = String.format("%d:%02d hours after the start", arrivalHour - testHour, arrivalMinutes - testMinute);
            } else {
                outputLine = String.format("%d minutes after the start", Math.abs(calc));
            }
        } else if (testHour > arrivalHour ) {

            if (calc <= 30) {
                output = "On time";
                outputLine = String.format("%d minutes before the start", Math.abs(calc));

            } else if (calc > 31) {
                output = "Early";

                if (calc < 60) {
                    outputLine = String.format("%d minutes before the start", Math.abs(calc));

                } else {

                    outputLine = String.format("%d:%02d hours before the start", testHour - arrivalHour, Math.abs(testMinute - arrivalMinutes));
                }
            }


        } else {
            output = "On time";
        }


        System.out.println(output);
        System.out.println(outputLine);
    }
}
