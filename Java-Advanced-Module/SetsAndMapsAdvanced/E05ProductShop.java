package AdvancedJava.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E05ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopMap = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");

            String shopName = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shopMap.putIfAbsent(shopName, new LinkedHashMap<>());

            shopMap.get(shopName).putIfAbsent(product, price);


            input = scanner.nextLine();
        }




       shopMap.entrySet().forEach(e->{

            System.out.println(e.getKey()+"->");
           e.getValue().forEach(((s,v)-> System.out.printf("Product: %s, Price: %.1f%n", s,v)));

        });

    }
}
