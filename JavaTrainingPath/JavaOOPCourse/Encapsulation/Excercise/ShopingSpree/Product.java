package JavaOOPCourse.Encapsulation.Excercise.ShopingSpree;

public class Product {
    private String name;
    private double cost;


    public Product(String name, double cost){
        setName(name);
        setCost(cost);
    }


    private void setName(String name) {
        if(name==null||name.equals(" ")){
            throw new IllegalStateException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if(cost<0){
            throw new IllegalStateException("Cost cannot be negative.");
        }

        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public double getCost(){
        return this.cost;
    }
}


