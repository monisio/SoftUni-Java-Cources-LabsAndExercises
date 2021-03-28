package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E07FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , String> emails = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while(!input.equals("stop")){
            String email= scanner.nextLine();
            String endWith = email.substring(email.indexOf("."));

            if(!".com.us.uk".contains(endWith) ){
                emails.putIfAbsent(input, email);
            }

            input= scanner.nextLine();
        }


        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }


    }
}
