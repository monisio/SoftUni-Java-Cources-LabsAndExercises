package JavaAdvancedCourse.DefiningClasses.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String , Person> personMap = new HashMap<>();

        String input = scanner.nextLine();


        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            Person currentPerson = personMap.get(name);

            if(currentPerson==null){
                personMap.put(name, new Person(name));
                currentPerson = personMap.get(name);
            }


            String info = tokens[2];
            String info2 = tokens[3];

            switch (tokens[1]){

                case "company":
                    currentPerson.setCompany(info,info2 , Double.parseDouble(tokens[4]));
                    break;

                case "pokemon":
                      currentPerson.addPokemon(info, info2);
                    break;

                case  "parents":
                    currentPerson.addParent(info,info2);
                    break;

                case "children":
                        currentPerson.addChildren(info, info2);
                    break;

                case "car":
                    currentPerson.setCar(info,Integer.parseInt(info2));
                    break;

            }

            input= scanner.nextLine();
        }


        String searchName = scanner.nextLine();

        System.out.println(personMap.get(searchName).toString());


    }
}
