package JavaOOPCourse.WorkingWithAbstraction.E04HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String secondVisitFix =  input[3].equals("SecondVisit")? "SECOND_VISIT":input[3];
        Seasons season = Seasons.valueOf(input[2].toUpperCase());
        DiscountType discount = DiscountType.valueOf(secondVisitFix.toUpperCase(Locale.ROOT));

        double vacationPrice = PriceCalculator.calculate(pricePerDay, days ,season ,discount);


        System.out.printf("%.2f",vacationPrice);

    }
}
