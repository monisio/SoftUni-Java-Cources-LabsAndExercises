package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Animals;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight );
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return super.toString() +String.format("%s,%d]",this.livingRegion,this.foodEaten);
    }
}
