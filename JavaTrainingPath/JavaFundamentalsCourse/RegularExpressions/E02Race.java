package JavaFundamentalsCourse.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] listOfParticipants = scanner.nextLine().split(", ");

        Pattern nameCheck = Pattern.compile("[A-Za-z]");
        Pattern distanceCheck = Pattern.compile("[\\d]");

        Map <String , Integer> results =new LinkedHashMap<>();

        for (String participant : listOfParticipants) {
            results.put(participant, 0);
        }

        String input = scanner.nextLine();



        while (!input.equals("end of race")){
            Matcher matchName = nameCheck.matcher(input);
            Matcher matchDistance = distanceCheck.matcher(input);
            String name = "";
            String numbers= "";

            while (matchName.find()){
                name+=(matchName.group());
            }

            while (matchDistance.find()){
                numbers+=(matchDistance.group());
            }

           if (!name.equals("")&&!numbers.equals("")&&results.containsKey(name)){

             int current =  results.get(name);
             int newMeters  = Arrays.stream(numbers.split("")).mapToInt(Integer::parseInt).sum();
                results.put(name, current+newMeters);
           }



            input = scanner.nextLine();
        }


        List<String> collected = results.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(3).map(e -> e.getKey().toString()).collect(Collectors.toList());

        System.out.printf( "1st place: %s%n2nd place: %s%n3rd place: %s%n", collected.get(0),collected.get(1),collected.get(2));

    }
}
