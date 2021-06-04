package JavaOOPCourse.InterfacesAndAbstraction.E05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identities = new ArrayList<>();

        while (!input.equalsIgnoreCase("End")) {
            String[] tokens = input.split("\\s+");

            Identifiable entity;

            if (tokens.length == 3) {
                entity = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            } else {
                entity = new Robot(tokens[0], tokens[1]);
            }

             identities.add(entity);

            input = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();

        for (Identifiable identity : identities) {
            String currentId= identity.getId();
            if(currentId.endsWith(fakeId)){
                System.out.println(currentId);
            }

        }

    }
}
