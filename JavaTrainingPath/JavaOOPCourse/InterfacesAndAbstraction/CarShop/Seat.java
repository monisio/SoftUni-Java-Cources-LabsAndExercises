package JavaOOPCourse.InterfacesAndAbstraction.CarShop;

public class Seat implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer horsePower, String countryProduced) {
        setModel(model);
        setColor(color);
        setHorsePower(horsePower);
        setCountryProduced(countryProduced);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return "This is " + this.model + " produced in Spain and have " + TYRES + " tyres";
    }
}
