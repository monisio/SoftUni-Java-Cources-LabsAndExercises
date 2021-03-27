package Fundamentals.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03OpinionPoll {
        static class Person {
            String name;
            int age;

            public Person(String name , int age ){
                this.name = name;
                this.age= age;

            }

            public int getAge(){
                return this.age;
            }

            public String getName(){
                return this.name;
            }

            @Override
            public String toString() {
                return this.name +" - "+ this.age;
            }




        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List <Person> personList = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String [] personInfo = scanner.nextLine().split("\\s+");

            Person p = new Person(personInfo[0],Integer.parseInt(personInfo[1]));

            personList.add(p);
        }



        List <Person> filtered = personList.stream()
                                 .filter(person -> person.getAge()>30)
                                 .sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());


        filtered.forEach(person -> System.out.println(person.toString()));






    }
}
