package JavaOOPCourse.Encapsulation.Excercise.ShopingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPersons = scanner.nextLine().split(";");

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String s : inputPersons) {
            String[] personInfo = s.split("=");
            String personName = personInfo[0].trim();
            Person person = new Person(personName, Double.parseDouble(personInfo[1]));
            personMap.putIfAbsent(personName, person);
        }

        String[] inputProducts = scanner.nextLine().split(";");

        for (String inputProduct : inputProducts) {
            String[] productInfo = inputProduct.split("=");
            String productName = productInfo[0].trim();
            Product product = new Product(productName, Double.parseDouble(productInfo[1]));
            productMap.putIfAbsent(productName, product);
        }


        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String personName = tokens[0].trim();
            String productName = tokens[1].trim();

            Person person = personMap.get(personName);
            Product product = productMap.get(productName);


            person.buyProduct(product);


            input = scanner.nextLine();
        }

        personMap.entrySet().forEach(p-> System.out.println(p.toString()));
    }
}
