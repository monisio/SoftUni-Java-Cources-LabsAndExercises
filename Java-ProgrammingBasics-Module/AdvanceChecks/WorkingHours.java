package AdvanceChecks;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();


        //open
        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day) || "Saturday".equals(day)) {// closed
            if (hour >= 10 && hour <= 18) {
                System.out.println("open");

            } else {
                System.out.println("closed");

            }
        }else if ("Sunday".equals(day)){
            System.out.println("closed");
        }
    }
}
