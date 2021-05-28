package JavaOOPCourse.Encapsulation.Excercise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;


    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int n) {
       checkToppingsNumber(n);
        this.toppings = new ArrayList<>(n);
    }

    private void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double sum = toppings.stream()
                .map(Topping::calculateCalories)
                .mapToDouble(Double::valueOf)
                .sum();
        return this.dough.calculateCalories() + sum;
    }


    private void checkName(String name) {
        if(name.length()<1||name.equals(" ")||name.length()>15){
            throw new IllegalStateException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    private void checkToppingsNumber(int n) {
        if (n < 0||n>10){
            throw new IllegalStateException("Number of toppings should be in range [0..10].");
        }
    }


}


