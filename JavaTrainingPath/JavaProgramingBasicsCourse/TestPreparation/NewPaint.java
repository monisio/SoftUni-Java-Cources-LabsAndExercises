package JavaProgramingBasicsCourse.TestPreparation;

import java.util.Scanner;

public class NewPaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*•	Предпазен найлон - 1.50 лв. за кв.м.
•	Боя - 14.50 лв. за литър
•	Разредител за боя - 5.00 лв. за литър
*/

//     Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички, а сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        int nailon =Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nailonSum = (nailon+2) * 1.50;
        double boqSum = (boq*1.1) * 14.50;
        double razreditelSum = razreditel* 5.00;
        double torbi = 0.40;

        double sumMat = nailonSum+ boqSum + razreditelSum+torbi;

        double workSum = (sumMat * 0.3) * workHours;

        double sumTotal = sumMat+workSum;

        System.out.printf("Total expenses: %.2f",sumTotal);

    }
}
