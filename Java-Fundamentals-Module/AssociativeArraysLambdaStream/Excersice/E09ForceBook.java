package Fundamentals.AssociativeArraysLambdaStream.Excersice;

import java.util.*;

public class E09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new HashMap<>();


        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {



            if (input.contains("|")) {
                String[] tokens = input.split("\\|" );
                String forceSide = tokens[0].trim();
                String forceUser = tokens[1].trim();

                forceBook.putIfAbsent(forceSide, new ArrayList<>());

                boolean isAlreadyExist = false;

                for (Map.Entry<String , List <String>> entry: forceBook.entrySet()){
                    if (entry.getValue().contains(forceUser)){
                        isAlreadyExist= true;
                        break;
                    }

                }

                if (!isAlreadyExist){
                    forceBook.get(forceSide).add(forceUser);
                }


            } else if(input.contains(" -> ")){
                String[] tokens = input.split("->");
                String forceUser = tokens[0].trim();
                String forceSide = tokens[1].trim();

                forceBook.putIfAbsent(forceSide, new ArrayList<>());

                for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                    List<String> sideList = entry.getValue();
                    sideList.remove(forceUser);
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

            }


            input = scanner.nextLine();
        }


        forceBook.entrySet().stream()
                .sorted((e1, e2) ->{
                    int result = Integer.compare( e2.getValue().size(), e1.getValue().size()) ;
                    if (result== 0){
                        result = e1.getKey().compareTo(e2.getKey());
                    }
                    return result;

        })
                .filter(e -> e.getValue().size() > 0)
                .forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().sorted(Comparator.naturalOrder()).forEach(p -> System.out.println("! " + p));

                });


    }


}
