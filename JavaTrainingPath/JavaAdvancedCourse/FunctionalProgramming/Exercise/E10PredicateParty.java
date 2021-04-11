package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameList = Arrays.stream(scanner.nextLine().split("\\s")).collect(Collectors.toList());

        String input = scanner.nextLine();





        while (!input.equals("Party!")) {
            String[] tokens = input.split(" ");
            List<String> resultList = new ArrayList<>();
            Predicate<String> predicate = getPredicate(tokens[1], tokens[2]);

            switch (tokens[0]) {

                case "Remove":
                  resultList = nameList.stream().filter(predicate).collect(Collectors.toList());
                  nameList.removeAll(resultList);
                    break;

                case "Double":
                  resultList = nameList.stream().filter(predicate).collect(Collectors.toList());
                  nameList.addAll(resultList);
                    break;
            }


            input = scanner.nextLine();
        }

        if(!nameList.isEmpty()){
            Collections.sort(nameList);
            System.out.print(String.join(", ", nameList)+ " are going to the party!");


        }else{
            System.out.println("Nobody is going to the party!");
        }


    }

    public static Predicate <String> getPredicate (String factor , String searchedString){

            switch (factor){
                case "StartsWith":
                    return  str-> str.startsWith(searchedString);
                case "EndsWith":
                    return  str -> str.endsWith(searchedString);
                case "Length":
                    return str -> str.length() == Integer.parseInt(searchedString);
                default :
                    throw new IllegalStateException("Wrong command type " + factor);
            }

    }

}
