package Fundamentals.AssociativeArraysLambdaStream;

import java.util.*;

public class E03Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine().toLowerCase();

        String [] inputArray = input.split(" ");

        Map<String, Integer> timesRepeated = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            String current = inputArray[i];

            if(timesRepeated.get(current)== null){
                timesRepeated.put(current,0);

            }

            timesRepeated.put(current, timesRepeated.get(current)+1 );

        }

        List<String> oddTimesWords = new ArrayList<>();

        for (Map.Entry <String, Integer> entry : timesRepeated.entrySet()) {

            if(entry.getValue() % 2 == 1){
                oddTimesWords.add(entry.getKey());
            }

        }

        for (int i = 0; i <oddTimesWords.size() ; i++) {

            if(i< oddTimesWords.size()-1){
                System.out.print(oddTimesWords.get(i) +", ");
            }else{
                System.out.print(oddTimesWords.get(i));
            }

        }

    }

}
