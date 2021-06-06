package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E04FoodShortage;

public class Citizen extends JavaOOPCourse.InterfacesAndAbstraction.Excersice.E01DefineAnInterfacePerson.Citizen implements Buyer {

    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age, id, birthDate);
        this.food=0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
