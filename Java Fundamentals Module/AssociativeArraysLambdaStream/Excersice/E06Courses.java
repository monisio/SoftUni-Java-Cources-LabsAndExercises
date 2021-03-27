package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.*;

public class E06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseList = new LinkedHashMap<>();




        while (!input.equals("end")) {

            String[] tokens = input.split(" : ");
            String courseToAdd = tokens[0];
            String newPersonName = tokens[1];

            List<String> course = courseList.get(courseToAdd);

            if (course == null) {
                course = new ArrayList<>();
                courseList.put(courseToAdd, course);

            }

            course.add(newPersonName);


            input = scanner.nextLine();
        }

        // printing to be done other way, with nested forEach functions.

        // there was a problem due to position of collection sort method
        courseList.entrySet().stream().sorted((l1, l2) -> Integer.compare(l2.getValue().size(), l1.getValue().size()))
                .forEach(e -> {
                    String course = e.getKey();
                    List<String> persons = e.getValue();
                    System.out.println(course + ": " + persons.size());

                    Collections.sort(persons);
                    for (String person : persons) {
                        System.out.println("-- " + person);
                    }
                });


    }
}
