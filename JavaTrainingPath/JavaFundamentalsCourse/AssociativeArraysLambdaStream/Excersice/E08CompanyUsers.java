package JavaFundamentalsCourse.AssociativeArraysLambdaStream.Excersice;

import java.util.*;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyRooster = new HashMap<>();

        while (!input.equals("End")){

            String[] tokens = input.split(" -> ");

            String companyName = tokens[0];
            String employeeId = tokens[1];

            companyRooster.putIfAbsent(companyName, new ArrayList<>());

            if (!companyRooster.get(companyName).contains(employeeId)){
                companyRooster.get(companyName).add(employeeId);
            }

            input= scanner.nextLine();
        }


        companyRooster.entrySet().stream().sorted((c1,c2)-> c1.getKey().compareTo(c2.getKey()))
                .forEach(c->{
                    System.out.println(c.getKey());
                    c.getValue().forEach(e-> System.out.println("-- "+e));
        });

    }
}
