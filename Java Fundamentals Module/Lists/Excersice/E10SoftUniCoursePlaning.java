package Fundamentals.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10SoftUniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("course start")) {

            String[] tokens = command.split(":");

            switch (tokens[0]) {
                case "Add":
                    if (!courseList.contains(tokens[1])) {
                        courseList.add(tokens[1]);
                    }
                    break;

                case "Insert":
                    if (!courseList.contains(tokens[1])) {
                        int indexToInsert = Integer.parseInt(tokens[2]);
                        courseList.add(indexToInsert, tokens[1]);
                    }
                    break;

                case "Remove":
                    if (courseList.contains(tokens[1])) {
                        courseList.remove(String.valueOf(tokens[1]));
                    }
                    if (courseList.contains(tokens[1] + "-Exercise")) {
                        courseList.remove(String.valueOf(tokens[1] + "-Exercise"));
                    }


                    break;

                case "Swap":

                    if (courseList.contains(tokens[1]) && courseList.contains(tokens[2])) {
                        int indexCourseOne = courseList.indexOf(tokens[1]);
                        int indexCourceTwo = courseList.indexOf(tokens[2]);
                        String courseOne = courseList.get(indexCourseOne);
                        String courseTwo = courseList.get(indexCourceTwo);

                        courseList.set(indexCourseOne, courseTwo);
                        courseList.set(indexCourceTwo, courseOne);

                        if (courseList.contains(tokens[1]+"-Exercise")){
                            courseList.remove(String.valueOf(tokens[1]+"-Exercise"));
                            courseList.add(courseList.indexOf(tokens[1]+1), tokens[1]+"-Exercise");
                        }else if (courseList.contains(tokens[2]+"-Exercise")){
                            courseList.remove(String.valueOf(tokens[2]+"-Exercise"));
                            courseList.add(courseList.indexOf(tokens[2])+1, tokens[2]+"-Exercise");

                        }



                    }


                    break;

                case "Exercise":
                    if (courseList.contains(tokens[1]) && !courseList.contains(String.valueOf(tokens[1]+"-Exercise"))){

                        courseList.add(courseList.indexOf(tokens[1])+1, tokens[1]+ "-Exercise" );
                    }else if (!courseList.contains(tokens[1])){
                        courseList.add(tokens[1]);
                        courseList.add(tokens[1]+"-Exercise");
                    }


                    break;
            }


            command = scanner.nextLine();
        }


        for (String item :courseList) {

            System.out.printf("%d.%s%n",courseList.indexOf(item)+1,item );
        }

    }


}
