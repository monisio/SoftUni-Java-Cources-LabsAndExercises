package JavaProgramingBasicsCourse.Exam;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //whod


        double pricePerPage = Double.parseDouble(scanner.nextLine()) * 899;
        double pricePerCover = Double.parseDouble(scanner.nextLine()) * 2;
        int procentNamalenie = Integer.parseInt(scanner.nextLine());
        double designerPrice = Double.parseDouble(scanner.nextLine());
        double percentEkip = Double.parseDouble(scanner.nextLine());


        //discount  sumata / procenta  =

        double sumPrint = pricePerCover + pricePerPage;

        double discount = (sumPrint /100) * procentNamalenie ;

        double sumWithDisk = sumPrint - discount;



        double sumWithDesign = sumWithDisk +designerPrice;

        double ekippercent = (sumWithDesign / 100 ) * percentEkip;



        double total = sumWithDesign - ekippercent;



        System.out.printf("Avtonom should pay %.2f BGN.", Math.abs(total));


    }
}
