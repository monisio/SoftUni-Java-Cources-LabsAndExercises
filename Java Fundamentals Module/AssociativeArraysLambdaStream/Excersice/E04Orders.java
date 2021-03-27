package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04Orders {

    public static class Product {
        String name;
        double price;
        int quantity;


        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void checkAndSetPrice(double price) {
            if (this.price != price) {
                setPrice(price);
            }

        }

        public double getTotal() {
            return this.price * this.quantity;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity += quantity;
        }




    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Product> productList = new LinkedHashMap<>();

        while (!line.equals("buy")) {
            String[] input = line.split(" ");
            /*"{name} {price} {quantity}" - input pattern */

            Product currentProduct = productList.get(input[0]);

            if(currentProduct==null){
                currentProduct= new Product(input[0], Double.parseDouble(input[1]), Integer.parseInt(input[2]));
                productList.put(input[0], currentProduct);
            }else {
                currentProduct.checkAndSetPrice(Double.parseDouble(input[1]));
                currentProduct.setQuantity(Integer.parseInt(input[2]));
            }

            line = scanner.nextLine();
        }


        productList.entrySet().forEach(e-> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue().getTotal()));


    }
}
