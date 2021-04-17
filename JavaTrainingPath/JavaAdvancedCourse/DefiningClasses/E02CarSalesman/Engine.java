package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

public class Engine {

    //model, power, displacement and efficiency
    //Engine's displacements and efficiency are optional
    private String model;
    private int power;
    private Integer displacement;
    private Character efficiency;


    public Engine(String model, Integer power, Integer displacement, Character efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, Integer power, Integer displacement) {
        this(model, power, displacement, null);
    }

    public Engine(String model, Integer power, Character efficiency) {
        this(model, power, null, efficiency);
    }

    public Engine(String model, int power) {
        this(model, power, null, null);
    }


    @Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %d%nEfficiency: %c%n",
                                this.model, this.displacement,this.power,this.efficiency);
    }
}
