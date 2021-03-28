package ForCyclesExercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//различни глоби:
//•	"Facebook" -> 150 лв.
//•	"Instagram" -> 100 лв.
//•	"Reddit" -> 50 лв.


        int nOpenedTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int website = 0;



//        if (salaryDecreased <= 0) {
//            System.out.println("You have lost your salary.");




        for (int i = 1; i <= nOpenedTabs; i++) {
            String websiteName = scanner.nextLine();


            if (websiteName.equals("Facebook")) {
                website += 150;
            }
            if (websiteName.equals("Instagram")) {
                website += 100;
            }
            if (websiteName.equals("Reddit")) {
                website += 50;
            } else {
                website += 0;
            }

            if (salary <= website){
                break;
            }

        }


        int salaryDecreased = salary - website;


        if (salaryDecreased<= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.printf("%d", salaryDecreased);
        }



    }


}
