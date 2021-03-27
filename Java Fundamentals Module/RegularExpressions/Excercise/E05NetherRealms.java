package Fundamentals.RegularExpressions.Excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" *, *");

        Map<String , String> mortalCombatList = new TreeMap<>();

        String expressionForDamage = "(-?)\\d+(\\.\\d+)?";
        Pattern findDamage = Pattern.compile(expressionForDamage);

        String expressionForHealth = "[^\\d\\+\\*\\/\\.-]";
        Pattern findHealth = Pattern.compile(expressionForHealth);

        String expressionForMultiply = "[*/]";
        Pattern multiplyOrDivide = Pattern.compile(expressionForMultiply);

        //(\-?)\d+(\.\d+)?(\**\/*) - optional with division and multiply included
        //[^0-9\+\*\/\.-] - health expression sum of symbols with this expression

        for (int i = 0; i < input.length ; i++) {
           String demonName= input[i];

           Matcher currentDemonHealth = findHealth.matcher(demonName);
           Matcher currentDemonDamage = findDamage.matcher(demonName);
           Matcher multiplyDivide = multiplyOrDivide.matcher(demonName);

           int health = 0;
           double damage = 0.0;

           while (currentDemonHealth.find()){
               int toAdd = currentDemonHealth.group().charAt(0);
               health+= toAdd;

           }

            while (currentDemonDamage.find()){

                double accumulatedDmg = Double.parseDouble(currentDemonDamage.group());
                damage += accumulatedDmg;
           }

            while (multiplyDivide.find()){
                String operator = multiplyDivide.group();

                if (operator.equals("*")){
                    damage*= 2;
                }else{
                    damage/= 2;
                }
            }



            String demonInfo = String.format( " - %d health, %.2f damage", health,damage);

            mortalCombatList.put(demonName, demonInfo);
        }

        mortalCombatList.entrySet().forEach(e-> System.out.println(e.getKey()+e.getValue()));
    }
}
