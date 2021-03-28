package TestPreparation;

import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int wincount = 0;
        int loosecount = 0;
        int drawn = 0;

        for (int i = 1; i <=3; i++) {
            String input = scanner.nextLine();
            int a= input.charAt(0);
            int b = input.charAt(2);

            if (a>b){
                wincount ++;
            }else if (a<b){
                loosecount++;
            }else {
                drawn ++;
            }



        }

        System.out.printf("Team won %d games.%n",wincount);
        System.out.printf("Team lost %d games.%n",loosecount);
        System.out.printf("Drawn games: %d",drawn);


    }
}
