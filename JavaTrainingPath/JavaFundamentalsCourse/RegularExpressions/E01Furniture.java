package JavaFundamentalsCourse.RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String expression = ">>(?<item>[A-Za-z\\s]+)<<(?<price>\\d+(.\\d+)?)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(expression);


        List<String> furnitureList = new ArrayList<>();
        double sumTotal = 0.0;

        while (!input.equals("Purchase")){

            Matcher matcher = pattern.matcher(input);

           if (matcher.find()){

               String name = matcher.group("item");
               double price = Double.parseDouble(matcher.group("price"));
               int quantity = Integer.parseInt(matcher.group("quantity"));
               double sum = price * quantity;

              furnitureList.add(name);
              sumTotal+=sum;
           }


            input=scanner.nextLine();
        }
        System.out.println("Bought furniture:");

        for (String s : furnitureList) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f%n",sumTotal );

    }
}
