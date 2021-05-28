package JavaOOPCourse.Encapsulation.Excercise.PizzaCalories;

public class Topping {

    private static final double BASE_CALORIES_MODIFIER = 2.0;

    private String toppingName;
    private double weight;

    private enum ToppingsTypes {
        MEAT(1.2),
        VEGGIES(0.8),
        CHEESE(1.1),
        SAUCE(0.9);

        private double modifier;

        ToppingsTypes(double modifier) {
            this.modifier = modifier;
        }

        private double getModifier() {
            return this.modifier;
        }
    }


    public Topping(String toppingName, double weight) {
        setToppingName(toppingName);
        setWeight(weight, toppingName);

    }


    private void setToppingName(String toppingName) {
        checkToppingData(toppingName);
        this.toppingName = toppingName;
    }

    private void setWeight(double weight, String toppingName) {
        if (weight < 1 || weight > 50) {
            throw new IllegalStateException(toppingName + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private void checkToppingData(String topingName) {
        try {
            ToppingsTypes.valueOf(topingName.toUpperCase());
        } catch (Exception e) {
            throw new IllegalStateException("Cannot place " + topingName + " on top of your pizza.");
        }
    }

    public double calculateCalories() {
        return (BASE_CALORIES_MODIFIER * this.weight)
                * ToppingsTypes.valueOf(this.toppingName.toUpperCase()).modifier;
    }

}
