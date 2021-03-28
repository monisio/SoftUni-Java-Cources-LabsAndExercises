package JavaFundamentalsCourse.AssociativeArraysLambdaStream.Excersice;

import java.util.*;

public class E07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentScoreBoard = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());

            List<Double> currentStudent = studentScoreBoard.get(name);

            if (currentStudent == null) {
                currentStudent = new ArrayList<>();
                studentScoreBoard.put(name, currentStudent);
            }

            currentStudent.add(score);

        }

        Map<String, Double> studentWithAverage = new HashMap<>();


        studentScoreBoard.forEach((key, value) -> {

            double asDouble = value.stream().mapToDouble(d -> d).average().getAsDouble();
            if (asDouble >= 4.5) {
                studentWithAverage.put(key, asDouble);
            }
        });


        studentWithAverage.entrySet().stream().sorted((s1, s2) -> Double.compare(s2.getValue(), s1.getValue()))
                .forEach(s -> System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue()));

    }
}
