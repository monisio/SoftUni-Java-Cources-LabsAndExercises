package Fundamentals.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E07OrderByAge {

    public static class Person{
        String name ;
        int id;
        int age;



        public Person(String name, int id , int age){
            this.name= name;
            this.id = id;
            this.age = age;

        }


        public static Person  parsePerson (String input ){

            String [] info = input.split(" ");

            return  new Person(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]));

        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String toString(){
            return String.format("%s with ID: %d is %d years old.",getName(),getId(),getAge());

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")){


            Person a = Person.parsePerson(input);

            personList.add(a);

            input= scanner.nextLine();
        }


        personList.sort(Comparator.comparingInt(Person::getAge));


        for (Person person : personList) {
            System.out.println(person.toString());
        }

    }




}
