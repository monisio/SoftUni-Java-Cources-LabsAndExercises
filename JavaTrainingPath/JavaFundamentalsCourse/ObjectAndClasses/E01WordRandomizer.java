package JavaFundamentalsCourse.ObjectAndClasses;

import java.util.Random;
import java.util.Scanner;

public class E01WordRandomizer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputLine = scanner.nextLine().split("\\s+");


        Random random = new Random();

        for (int i = 0; i < inputLine.length ; i++) {
            int x = random.nextInt(inputLine.length);
            int y = random.nextInt(inputLine.length);

            String oldWordX = inputLine[x];
            inputLine[x]= inputLine[y];
            inputLine[y]= oldWordX;


        }


        for (String line : inputLine) {
            System.out.print(line+ " ");
        }



    }



}
