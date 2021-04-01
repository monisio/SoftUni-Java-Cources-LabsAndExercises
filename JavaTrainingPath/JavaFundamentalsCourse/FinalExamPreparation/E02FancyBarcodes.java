package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");




        while (counter-- > 0) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String message = "Product group: ";
                Pattern digitsPattern = Pattern.compile("[0-9]");
                Matcher digitsMatcher = digitsPattern.matcher(matcher.group());

                if (digitsMatcher.find()) {

                    StringBuilder group = new StringBuilder();
                    group.append(digitsMatcher.group());
                    while (digitsMatcher.find()) {

                        group.append(digitsMatcher.group());
                    }
                    message += group.toString();

                } else {
                    message += "00";
                }

                System.out.println(message);
            } else {
                System.out.println("Invalid barcode");
            }

            if(counter!=0){

                input = scanner.nextLine();
            }

        }


    }
}
