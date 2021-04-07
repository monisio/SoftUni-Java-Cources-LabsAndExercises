package JavaAdvancedCourse.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class E05FilterByAge {

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static Person parsePerson(String input) {
            String[] info = input.split(", ");
            return new Person(info[0], Integer.parseInt(info[1]));
        }

        public int getAge(){
            return this.age;
        }

        public String getName(){
            return this.name;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        while (n-- != 0) {

            Person newPerson = Person.parsePerson(scanner.nextLine());

            personList.add(newPerson);

        }


        String factor = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<Integer> checkAge = getFunction(factor, age);
        Consumer<String> printing = getPrintingFormat(format);


    }

    private static Consumer<String> getPrintingFormat(String format) {

        switch (format) {
            case "name":
                return p-> System.out.println();
            case "age":

                return

            case "name age":
                return
        }

    }


    public static Predicate<Integer> getFunction(String factor, int age) {


        return factor.equals("older") ? n -> n > age : n -> n < age;
    }
}
