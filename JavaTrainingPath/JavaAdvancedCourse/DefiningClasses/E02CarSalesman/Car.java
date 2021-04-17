package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

public class Car {
    private static final String missingValueDefault = "n\\a";
    //Car has a model, engine, weight and color.
    //weight and color
    private String model;
    private Engine engine;
    private Double weight;
    private String color;

    public Car(String model, Engine engine, Double weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, double weight) {
        this(model, engine, weight, null);
    }
    public Car(String model, Engine engine,String color){
        this(model, engine,null,color);
    }
    public Car(String model, Engine engine) {
        this(model, engine, null, null);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
