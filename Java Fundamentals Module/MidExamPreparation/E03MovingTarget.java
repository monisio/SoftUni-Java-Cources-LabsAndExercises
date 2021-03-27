package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> shootingRange = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);

            switch (command) {
                case "Shoot":
                    if (index >= 0 && index < shootingRange.size()) {
                       int shot = shootingRange.get(index)-value;

                       if(shot<=0){
                           shootingRange.remove(index);
                       }else{
                           shootingRange.set(index,shot);
                       }

                    }

                    break;
                case "Add":

                    if (index >= 0 && index < shootingRange.size()) {
                        shootingRange.add(index,value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                     int startIndex = index-value;
                     int endIndex = index+value;

                     if(startIndex>=0&&endIndex<shootingRange.size()){
                        shootingRange.remove(index);

                        for (int i = 0; i < value*2 ; i++) {
                             shootingRange.remove(startIndex);
                        }

                     }else{
                         System.out.println("Strike missed!");
                     }


                    break;
            }


            input = scanner.nextLine();
        }


        System.out.println(shootingRange.toString().replaceAll("[\\[\\]]", "" ).replaceAll(", ","|"));


    }
}
