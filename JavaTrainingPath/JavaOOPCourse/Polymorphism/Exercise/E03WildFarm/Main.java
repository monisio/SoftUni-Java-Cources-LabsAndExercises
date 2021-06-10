package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm;

import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals.*;
import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Food;
import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Meat;
import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();



        while (!input.equals("End")){
            String [] animalTokens = input.split("\\s+");
            String [] foodTokens = scanner.nextLine().split("\\s+");

            String type = animalTokens[0];
            String name= animalTokens[1];
            Double weight=Double.valueOf(animalTokens[2]);
            String livingRegion = animalTokens[3];

            Animal animal ;

            if (type.equals("Cat")){
                animal= new Cat(name,type,weight,livingRegion,animalTokens[4]);
            }else if(type.equals("Tiger")){
                animal= new Tiger(name,type,weight,livingRegion);
            }else if(type.equals("Mouse")){
                animal= new Mouse(name,type,weight,livingRegion);
            }else{
                animal= new Zebra(name,type,weight,livingRegion);
            }

            Food food ;
            int quantity=Integer.parseInt(foodTokens[1]);
            if(foodTokens[0].equals("Vegetable")){
                food= new Vegetable(quantity);
            }else{
                food= new Meat(quantity);
            }


            animal.makeSound();
            animal.eat(food);
            System.out.println(animal.toString());

            input = scanner.nextLine();
        }

    }
}
