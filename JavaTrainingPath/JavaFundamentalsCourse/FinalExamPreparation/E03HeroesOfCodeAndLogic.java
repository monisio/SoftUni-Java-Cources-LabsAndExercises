package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.*;

public class E03HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroList = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] newHero = scanner.nextLine().split("\\s");
            String name = newHero[0];
            int hp = Integer.parseInt(newHero[1]);
            int mp = Integer.parseInt(newHero[2]);

            heroList.putIfAbsent(name, new ArrayList<>(List.of(hp, mp)));

        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split(" - ");
            String action = commands[0];
            String heroName = commands[1];
            int resource = Integer.parseInt(commands[2]);
            List<Integer> heroStats = heroList.get(heroName);

            int currentHp = heroStats.get(0);
            int currentMp = heroStats.get(1);

            String output = null;

            switch (action) {

                case "CastSpell":

                    if (currentMp >= resource) {
                        int decrease = currentMp - resource;
                        heroStats.set(1, decrease);
                        output = String.format("%s has successfully cast %s and now has %d MP!", heroName, commands[3], decrease);
                    } else {
                        output = String.format("%s does not have enough MP to cast %s!", heroName, commands[3]);
                    }

                    break;
                case "TakeDamage":
                    int takenDamage = currentHp - resource;
                    if (takenDamage > 0) {
                        heroStats.set(0, takenDamage);
                        output = String.format("%s was hit for %d HP by %s and now has %d HP left!", heroName, resource, commands[3], takenDamage);
                    } else {
                        heroList.remove(heroName);
                        output = String.format("%s has been killed by %s!", heroName, commands[3]);
                    }

                    break;
                case "Recharge":
                    int rechargedMP = currentMp + resource;
                    int rechargedAmount;
                    if (rechargedMP > 200) {
                        rechargedMP = 200;
                        rechargedAmount = 200 - currentMp;
                    } else {
                        rechargedAmount = resource;
                    }
                    heroStats.set(1, rechargedMP);

                    output = String.format("%s recharged for %d MP!", heroName, rechargedAmount);

                    break;
                case "Heal":
                    int healedHp = currentHp + resource;
                    int healedAmount;
                    if (healedHp > 100) {
                        healedHp = 100;
                        healedAmount = 100 - currentHp;
                    } else {
                        healedAmount = resource;
                    }
                    heroStats.set(0, healedHp);

                    output = String.format("%s healed for %d HP!", heroName, healedAmount);
                    break;


            }

            if (output != null) {
                System.out.println(output);
            }

            input = scanner.nextLine();
        }

        heroList.entrySet().stream()
                .sorted((h1, h2) -> {
                    int result = h2.getValue().get(0).compareTo(h1.getValue().get(0));
                    if (result == 0) {
                        result = h1.getKey().compareTo(h2.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s%n HP: %d%n MP: %d%n", e.getKey(), e.getValue().get(0), e.getValue().get(1)));


    }
}
