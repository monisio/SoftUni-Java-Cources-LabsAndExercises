package JavaAdvancedCourse.FunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E05FilterByAge {

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Function<String, Person> parsePerson = str -> {
            String[] tokens = str.split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));

        };

        List<Person> personList = new ArrayList<>();

        while (n-- != 0) {

            personList.add(parsePerson.apply(scanner.nextLine()));


        }


        String factor = scanner.nextLine();
        int ageCondition = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        personList = factor.equals("older")
                ? filterPeople(personList, p -> p.age >= ageCondition)
                : filterPeople(personList, p -> p.age <= ageCondition);




        System.out.println(printCollection(personList, getFormatterFunction(format)
                                             , System.lineSeparator()));
    }


    //factory method for generating function below
    private static Function<Person, String> getFormatterFunction(String format) {

        switch (format){
            case "name":
                return person -> person.name;
            case "age":
                return person -> String.valueOf(person.age);
            case "name age":
                return person -> person.name + " - " +person.age;
            default:
                throw new IllegalStateException("Unknown format type "+format);
        }

    }

    public static List<Person> filterPeople(Collection<Person> persons, Predicate<Person> criteria) {

        return persons.stream()
                .filter(criteria)
                .collect(Collectors.toList());

    }

    public static String printCollection (Collection<Person> people,Function<Person,String>filter , String delimiter){

       return  people.stream()
               .map(p->filter.apply(p))
               .collect(Collectors.joining(delimiter));


    }

}
