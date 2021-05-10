package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E05StrategyPattern;

import JavaAdvancedCourse.IteratorsAndComparators.Exercises.E04ComparingObjects.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> personSetByAge = new TreeSet<>(new ComparatorByAge());
        Set<Person> personSetByName = new TreeSet<>(new ComparatorByName());

        while (n-- >= 0) {

            String[] tokens = scanner.nextLine().split("\\s");

            personSetByAge.add(new Person(tokens[0], Integer.parseInt(tokens[1])));
            personSetByName.add(new Person(tokens[0], Integer.parseInt(tokens[1])));


        }


    }
}
