package JavaOOPCourse.Inheritance.Exercise.Animals;

import JavaOOPCourse.Inheritance.Exercise.Animals.animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("Beast!")) {

            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            Animal current = null;

            try{

                switch (input) {

                    case "Dog":

                        current = new Dog(name, age, gender);
                        break;

                    case "Cat":
                        current = new Cat(name, age, gender);
                        break;
                    case "Frog":
                        current = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        current = new Kitten(name, age, gender);
                        break;

                    case "Tomcat":
                        current = new Tomcat(name, age, gender);
                        break;
                }
            }   catch (Exception e){
                System.out.println(e.getMessage());
            }


            if (current != null) {
                System.out.println(current.toString());
            }

            input = scanner.nextLine();
        }


    }
}
