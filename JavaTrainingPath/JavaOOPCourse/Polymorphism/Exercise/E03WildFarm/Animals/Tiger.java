package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals;

import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Food;
import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Meat;

public class Tiger extends Mammal {
    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            eat(food.getQuantity());
        }else {
            printWrongFoodMessage();
        }
    }
}
