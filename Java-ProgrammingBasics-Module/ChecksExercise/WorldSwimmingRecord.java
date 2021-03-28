package ChecksExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine()); // sekundi
        double distance = Double.parseDouble(scanner.nextLine()); //metri
        double timePerMeter = Double.parseDouble(scanner.nextLine()); // sekundi za 1 metur

        double resistance = Math.floor(distance / 15) * 12.5; // suprotivlenie dobavq se kym krainiq rezultat na ivan


        double ivanDistance = (distance * timePerMeter) + resistance;

        double diff = record - ivanDistance;


        if (record <= ivanDistance ) {
            System.out.printf ("No, he failed! He was " + "%.2f"+ " seconds slower.", ivanDistance - record);
        } else {
            System.out.printf ("Yes, he succeeded! The new world record is " + "%.2f"+ " seconds.", ivanDistance );
        }

    }
}

