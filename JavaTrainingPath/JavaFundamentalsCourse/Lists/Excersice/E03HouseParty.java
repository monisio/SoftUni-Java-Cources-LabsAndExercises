package JavaFundamentalsCourse.Lists.Excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> partyList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {


           List <String> command = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String person = command.get(0);

            if (command.contains("not")){

               if (partyList.contains(person)){

                   partyList.remove(String.valueOf(person));

               }else{
                   System.out.printf("%s is not in the list!%n",person);
               }

           }else {

                if(!partyList.contains(person)){
                    partyList.add(person);
                }else{
                    System.out.printf("%s is already in the list!%n",person);
                }

           }



        }


        for (String person : partyList) {
            System.out.println(person);

        }
    }
}
