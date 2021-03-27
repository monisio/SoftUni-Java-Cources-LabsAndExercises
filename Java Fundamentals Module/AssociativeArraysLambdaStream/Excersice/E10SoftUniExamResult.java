package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E10SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> userAndScore = new HashMap<>();
        Map<String, Integer> languageParticipants = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
//: "{username}-{language}-{points}

            String[] tokens = input.split("-");

            if (tokens.length == 3) {
                String user = tokens[0];
                String language = tokens[1];
                int score = Integer.parseInt(tokens[2]);


                languageParticipants.putIfAbsent(language, 0);
                languageParticipants.put(language, languageParticipants.get(language) + 1);

                // user and score will contain = key-language, map -> key user value -> score;

                userAndScore.putIfAbsent(user, score);

                if (userAndScore.get(user)<score){

                    userAndScore.put(user, score);
                }


            } else {
                String userToRemove = tokens[0];

                userAndScore.remove(userToRemove);

            }


            input = scanner.nextLine();
        }

        System.out.println("Results: ");
         userAndScore.entrySet().stream().sorted((a ,b)->{
             int result = Integer.compare(b.getValue(), a.getValue());
             if (result==0){
                 result= a.getKey().compareTo(b.getKey());
             }
             return result;
         }).forEach(e-> System.out.println(e.getKey() +" | "+e.getValue()));

        System.out.println("Submissions: ");

        languageParticipants.entrySet().stream().sorted((a , b)-> {
            int result = Integer.compare(b.getValue(), a.getValue());
            if (result==0){
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(entry -> System.out.println(entry.getKey() +" - "+ entry.getValue()));

    }
}
