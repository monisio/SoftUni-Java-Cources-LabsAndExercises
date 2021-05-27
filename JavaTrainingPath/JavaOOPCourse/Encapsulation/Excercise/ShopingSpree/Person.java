package JavaOOPCourse.Encapsulation.Excercise.ShopingSpree;


import java.util.ArrayList;
import java.util.List;

public class Person {
    //     -	name: String
//        -	money:  double
//        -	products:  List<Product>
//+ 	Person (String ,  double)
//        -	setName (String) : void
//        -	setMoney (double) : void
//        +	buyProduct (Product) : void
//        +	getName(): String

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products= new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.equals(" ")) {
            throw new IllegalStateException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalStateException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void buyProduct(Product product) {
        double cost = product.getCost();
        double calculation = this.money - cost;
        if (calculation < 0) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        setMoney(calculation);
        this.products.add(product);

    }


    @Override
    public String toString() {
        return this.name + " - " + (products.isEmpty() ? "Nothing bought" : products.stream().map(Product::getName).toString());
    }
}

