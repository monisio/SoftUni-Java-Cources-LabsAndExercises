package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals;

import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        eat(food.getQuantity());
    }

    @Override
    public String toString() {
         DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s[%s,%s,%s,%d] "
                , this.animalType
                , this.animalName
                ,this.breed
                , df.format(this.animalWeight)
                , this.foodEaten);
    }
}
