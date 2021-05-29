package JavaOOPCourse.Encapsulation.Excercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("\\s+");

        String pizzaName = info[1].trim();
        int n = Integer.parseInt(info[2]);

        Pizza pizza = new Pizza(pizzaName, n);

        String[] doughInfo = scanner.nextLine().split("\\s+");

        pizza.setDough(new Dough(doughInfo[1], doughInfo[2], Double.parseDouble(doughInfo[3])));

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] toppingInfo = input.split("\\s+");

            pizza.addTopping(new Topping(toppingInfo[1].trim(), Double.parseDouble(toppingInfo[2])));

            input = scanner.nextLine();
        }

        System.out.println(pizza.getName()+" - "+pizza.getOverallCalories());
    }


}
