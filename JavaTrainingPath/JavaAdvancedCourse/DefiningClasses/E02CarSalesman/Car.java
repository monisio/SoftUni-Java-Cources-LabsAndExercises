package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

public class Car {
    private static final String missingValueDefault = "n\\a";
    //Car has a model, engine, weight and color.
    //weight and color
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
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
       String output = this.model+":" +System.lineSeparator()+ this.engine.toString()
                     +String.format("Weight: %d%nColor: %s",this.weight,this.color);



       if(output.contains("null")){
         output = output.replaceAll("null", "n/a");
       }

       return output;
    }
}
