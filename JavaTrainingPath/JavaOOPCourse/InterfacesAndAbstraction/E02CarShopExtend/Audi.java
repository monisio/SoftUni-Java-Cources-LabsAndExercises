package JavaOOPCourse.InterfacesAndAbstraction.E02CarShopExtend;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;


    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        setMinRentDay(minRentDay);
        setPricePerDay(pricePerDay);
    }

    private void setMinRentDay(Integer minRentDay){
        this.minRentDay= minRentDay;
    }

    private void setPricePerDay(Double pricePerDay){
        this.pricePerDay= pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return  super.toString() +System.lineSeparator()+"Minimum rental period of "+this.getMinRentDay()+" days."+" Price per day "+this.getPricePerDay();

    }


}
