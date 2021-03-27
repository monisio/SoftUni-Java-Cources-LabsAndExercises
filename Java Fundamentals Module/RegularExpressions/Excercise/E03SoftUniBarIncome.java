package Fundamentals.RegularExpressions.Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "%(?<name>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|$%\\.]*\\|(?<quant>\\d+)\\|[^\\|$%\\.\\d]*(?<price>\\d+(.\\d+)?)\\$";
        Pattern p = Pattern.compile(expression);

        String input = scanner.nextLine();
        double sum = 0.0;

        while (!input.equals("end of shift")){
            Matcher m = p.matcher(input);

            while(m.find()){
                String name = m.group("name");
                String product = m.group("product");
                int quantity= Integer.parseInt(m.group("quant"));
                double price = Double.parseDouble(m.group("price"));
                double priceSum = quantity*price;
                sum+= priceSum;
                System.out.printf("%s: %s - %.2f%n",name, product,priceSum);



            }
            input=scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",sum);
    }
}
