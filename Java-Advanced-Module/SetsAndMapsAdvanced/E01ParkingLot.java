package AdvancedJava.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingSet = new LinkedHashSet<>();

            while (!input.equals("END")){
                String carPlate = input.substring(input.indexOf(" ")+1);


                if(input.contains("IN")){
                   parkingSet.add(carPlate);

                }else if (input.contains("OUT")){

                    parkingSet.remove(carPlate);
                }

                input = scanner.nextLine();

            }


            if(parkingSet.isEmpty()){
                System.out.println("Parking Lot is Empty");
            }else{
              parkingSet.forEach(System.out::println);
            }


    }
}
