package FirstStepsInJavaExercise1;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int hourReading = Integer.parseInt(scanner.nextLine());

        int hoursPerBook = bookPages / pagesPerHour;
        int timeNeeded = hoursPerBook / hourReading;

        System.out.print(timeNeeded);
    }
}
