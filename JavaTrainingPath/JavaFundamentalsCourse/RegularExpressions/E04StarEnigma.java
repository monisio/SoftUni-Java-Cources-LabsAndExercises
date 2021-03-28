package JavaFundamentalsCourse.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String findCountExpression = "[star]";
        Pattern patternCount = Pattern.compile(findCountExpression, Pattern.CASE_INSENSITIVE ); // case insensitive flag should be used
        String decipherExpression = "@(?<name>[A-Za-z]+)([^@!:>-]*):[^@!:>-]*(?<population>\\d+)[^@!:>-]*![^@!:>-]*(?<type>[AD])[^@!:>-]*![^@!:>-]*->[^@!:>-]*(?<soldiers>\\d+)";
        Pattern decipher = Pattern.compile(decipherExpression);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher lettersFinder = patternCount.matcher(input);

            int key = 0;

            while (lettersFinder.find()) {
               key ++;
            }
            // problem was usage of forach loop cannot push back the result, we should use for loop instead
           char [] inputAsArray= input.toCharArray();
            for (int j = 0; j < inputAsArray.length ; j++) {
                int a = inputAsArray[j];
                int subtract = a - key  ;
                inputAsArray[j] = (char) subtract;
            }

            String message = String.valueOf(inputAsArray); // String.valueOf() is used to return char array into String state.


            Matcher decipheredMessage = decipher.matcher(message);

            if (decipheredMessage.find()) {
                String name = decipheredMessage.group("name");
                String status = decipheredMessage.group("type");

                if (status.equals("A")) {
                    attackedPlanets.add(name);
                } else {
                    destroyedPlanets.add(name);
                }


            }


        }

        System.out.println("Attacked planets: "+attackedPlanets.size());
            attackedPlanets.stream().sorted(String::compareTo).forEach( p-> System.out.println("-> "+p));

          System.out.println("Destroyed planets: "+destroyedPlanets.size());
            destroyedPlanets.stream().sorted(String::compareTo).forEach( p-> System.out.println("-> "+p));
    }

}
