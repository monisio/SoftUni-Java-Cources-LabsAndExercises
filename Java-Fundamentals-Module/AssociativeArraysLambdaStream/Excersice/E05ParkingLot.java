package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] tokens = input.split(" ");
            String personName = tokens[1];

            String person = parkingLot.get(personName);

            if (input.contains("unregister")) {

                if (person == null) {
                    System.out.println("ERROR: user " + personName + " not found");
                } else {
                    parkingLot.remove(personName);
                    System.out.println(personName + " unregistered successfully");
                }


            } else {
                String registrationPlate = tokens[2];

                if (person == null) {
                    parkingLot.put(personName, registrationPlate);
                    System.out.println(personName + " registered " + registrationPlate + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + person);
                }
            }


        }


        parkingLot.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}
