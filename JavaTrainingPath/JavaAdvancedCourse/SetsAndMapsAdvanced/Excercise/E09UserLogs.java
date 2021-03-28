package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E09UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "IP=(?<ip>[A-Za-z0-9:.]+) message=['\\w&.!?,]+ user=(?<user>[\\w]+)";
        Pattern pattern = Pattern.compile(expression);


        Map<String, Map<String, Integer>> logs = new TreeMap<>();

        String input = scanner.nextLine();


        while (!input.equals("end")) {

            Matcher matcher = pattern.matcher(input);

            matcher.find();

            String userName = matcher.group("user");
            String ip = matcher.group("ip");
            logs.putIfAbsent(userName, new LinkedHashMap<>());
            logs.get(userName).putIfAbsent(ip, 0);
            logs.get(userName).put(ip, logs.get(userName).get(ip) + 1);


            input = scanner.nextLine();
        }

        logs.entrySet().forEach(e -> {
            System.out.println(e.getKey() + ": ");
            System.out.println(e.getValue().toString().replace("{", "").replace("}", ".").replaceAll("=", " => "));

        });
    }
}
