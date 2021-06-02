package JavaOOPCourse.InterfacesAndAbstraction.E04SayHelloExtended;

import JavaOOPCourse.InterfacesAndAbstraction.E03SayHello.Bulgarian;
import JavaOOPCourse.InterfacesAndAbstraction.E03SayHello.Chinese;
import JavaOOPCourse.InterfacesAndAbstraction.E03SayHello.European;
import JavaOOPCourse.InterfacesAndAbstraction.E03SayHello.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();


        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            System.out.println(person.getName());
            print(person);
        }


    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }

}
