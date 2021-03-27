package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<String> inputList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

       String  command = scanner.nextLine();


       while (!command.equals("Go Shopping!")){
           String [] tokens = command.split(" ");

           String token = tokens[0];
           String product = tokens[1];

           if(token.equals("Urgent")){
               if(!inputList.contains(product)){
                   inputList.add(0, product);
               }

           }else if(token.equals("Unnecessary")){
                inputList.remove(product);

           }else if(token.equals("Correct")){
               String newProduct= tokens[2];
               int index = inputList.indexOf(product);
               if(index>-1){
                   inputList.set(index , newProduct );
               }


           }else if(token.equals("Rearrange")){
               int index = inputList.indexOf(product);
               if(index>-1){
                   inputList.remove(index);
                   inputList.add(product);

               }

           }


           command= scanner.nextLine();
       }


        System.out.println(inputList.toString().replaceAll("[\\[\\]]",""));



    }
}
