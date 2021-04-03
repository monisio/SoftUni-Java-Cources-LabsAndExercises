package JavaFundamentalsCourse.FinalExam;

import java.util.*;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> users = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("->");
            String username = tokens[1];
            String message = null;
            switch (tokens[0]) {

                case "Add":

                    if (!users.containsKey(username)) {
                        users.put(username, new ArrayList<>());
                    } else {
                        message = String.format("%s is already registered", username);
                    }

                    break;

                case "Send":
                    users.get(username).add(tokens[2]);
                    break;

                case "Delete":
                    if (users.containsKey(username)) {
                        users.remove(username);
                    } else {
                        message = String.format("%s not found!", username);
                    }

                    break;

            }

            if (message != null) {
                System.out.println(message);
            }

            input = scanner.nextLine();
        }

        System.out.println("Users count: " + users.size());
        users.entrySet().stream()
                .sorted((u1, u2) -> {
                    int result = Integer.compare(u2.getValue().size(), u1.getValue().size());
                    if (result == 0) {
                        result = u1.getKey().compareTo(u2.getKey());
                    }
                    return result;
                }).forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().forEach(m -> System.out.println(" - " + m));
        });

    }
}
