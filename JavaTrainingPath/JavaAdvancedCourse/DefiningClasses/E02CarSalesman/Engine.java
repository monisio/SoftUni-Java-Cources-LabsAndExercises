package JavaAdvancedCourse.DefiningClasses.E02CarSalesman;

public class Engine {

    //model, power, displacement and efficiency
    //Engine's displacements and efficiency are optional
    private String model;
    private Integer power;
    private Integer displacement;
    private String efficiency;


    public Engine(String model, Integer power, Integer displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, Integer power, Integer displacement) {
        this(model, power, displacement, null);
    }

    public Engine(String model, Integer power, String efficiency) {
        this(model, power, null, efficiency);
    }

    public Engine(String model, int power) {
        this(model, power, null, null);
    }


    @Override
    public String toString() {
        return String.format("%s:%nPower: %d%nDisplacement: %d%nEfficiency: %s%n",
                                this.model, this.power,this.displacement,this.efficiency);
    }
}
