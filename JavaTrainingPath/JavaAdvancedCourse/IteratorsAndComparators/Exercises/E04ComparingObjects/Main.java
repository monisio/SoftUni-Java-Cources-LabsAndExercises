package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E04ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Person> personList= new ArrayList<>();


        while (!input.equals("END")){
            String [] tokens = input.split("\\s");
            String name = tokens[0];
            int age =Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person newPerson= new Person(name,age, town);

            personList.add(newPerson);


            input = scanner.nextLine();
        }

        Person p = personList.get(Integer.parseInt(scanner.nextLine())-1);

        int equalsCounter = 0;
        int differentCounter = 0;

        for (Person person : personList) {

            if(person.compareTo(p)==0){
                equalsCounter++;
            }else{
                differentCounter++;
            }

        }

        if(equalsCounter==1){
            System.out.println("No matches");
        }else{
            System.out.println(equalsCounter+" "+differentCounter+" "+personList.size());
        }


    }
}
