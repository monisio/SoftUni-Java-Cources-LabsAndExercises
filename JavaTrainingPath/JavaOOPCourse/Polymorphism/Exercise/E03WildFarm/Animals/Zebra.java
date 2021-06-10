package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals;

import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Food;
import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Vegetable;

public class Zebra extends Mammal{

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Vegetable){
            eat(food.getQuantity());
        }else {
          printWrongFoodMessage();
        }
    }
}
