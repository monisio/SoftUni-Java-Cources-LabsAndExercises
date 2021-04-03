package JavaFundamentalsCourse.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("(.+)>(?<digit>[0-9]{3})\\|(?<lower>[a-z]{3})\\|(?<upper>[A-Z]{3})\\|(?<char>.+[^><])<\\1");


        for (int i = 0; i <count ; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            String message= null;
            if(matcher.find()){
                message="Password: "+matcher.group("digit")+matcher.group("lower")+matcher.group("upper")+matcher.group("char");

            }else{
                message= "Try another password!";
            }

            System.out.println(message);

        }


    }
}
