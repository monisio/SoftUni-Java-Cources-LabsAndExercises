package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("Craft!")){
            String [] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command){

                case "Collect":

                    if(!inventory.contains(item)){
                       inventory.add(item);
                    }

                    break;
                case "Drop":

                    inventory.remove(item);

                    break;
                case "Combine Items":

                    String [] oldNew = item.split(":");

                    if(inventory.contains(oldNew[0])){
                        int index =  inventory.indexOf(oldNew[0]);
                      if(index == inventory.size()-1){
                          inventory.add(oldNew[1]);
                      }else{
                          inventory.add(index+1, oldNew[1]);
                      }

                    }

                  break;

                case "Renew":
                    if(inventory.contains(item)){
                        inventory.remove(item);
                        inventory.add(item);
                    }

                    break;



            }



            input = scanner.nextLine();
        }

        System.out.println(inventory.toString().replaceAll("[\\[\\]]",""));

    }
}
