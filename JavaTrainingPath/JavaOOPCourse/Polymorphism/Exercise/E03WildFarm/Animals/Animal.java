package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals;

import JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight ){
        this.animalName= animalName;
        this.animalType=animalType;
        this.animalWeight= animalWeight;
        this.foodEaten = 0;
    }

    protected void printWrongFoodMessage(){
        System.out.println( this.animalType+ " are not eating that type of food!");
    }

    protected void eat(Integer quantity){
        foodEaten+=quantity;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s[%s,%s,"
                , this.animalType
                , this.animalName
                , df.format(this.animalWeight));
    }
}
