package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E04FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String , Buyer> buyerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);


            if( tokens.length==3){
                buyerMap.put(name, new Rebel(name, age, tokens[2]));
            }else {
                buyerMap.put(name, new Citizen(name, age , tokens[2], tokens[3]));
            }

        }

        String input = scanner.nextLine();



        while (!input.equals("End")){

            Buyer buyer = buyerMap.get(input);

            if(buyer!=null){
                buyer.buyFood();

            }

            input= scanner.nextLine();
        }


        System.out.println(buyerMap.values()
                .stream()
                .map(Buyer::getFood)
                .mapToInt(Integer::valueOf).sum());
    }
}
