package JavaFundamentalsCourse.TextProcessing.Excercise;

import java.util.Scanner;

public class E07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder input = new StringBuilder(scanner.nextLine());

        int power = 0;


        for (int i = 0; i <input.length() ; i++) {

            int current = input.charAt(i);

            if (current == '>'){
                int addPower =Integer.parseInt(String.valueOf( input.charAt(i+1)));
                power+= addPower;

            } else if (power>0){
                input.deleteCharAt(i);
                power--;
                i--;
            }
        }


        System.out.println(input);

    }
}
