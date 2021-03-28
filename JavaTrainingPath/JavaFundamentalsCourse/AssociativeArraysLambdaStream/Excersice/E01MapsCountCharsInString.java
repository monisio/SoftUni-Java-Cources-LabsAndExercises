package JavaFundamentalsCourse.AssociativeArraysLambdaStream.Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01MapsCountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map <Character, Integer> mapOfChars = new LinkedHashMap<>();

        // в лекцията е показано решение с input.toCharArray(); статичен метод на Class String
        // като итерираме по следния начин for ( char c : input.toCharArray()){

        for (int i = 0; i <input.length() ; i++) {

            char current = input.charAt(i);

            if( input.charAt(i)!= 32){

              mapOfChars.putIfAbsent(current,0);
              mapOfChars.put(current, mapOfChars.get(current)+1);

            }



        }


        for (Map.Entry <Character, Integer> entry : mapOfChars.entrySet()) {
            System.out.println (entry.getKey()+ " -> "+ entry.getValue());

        }



    }
}
