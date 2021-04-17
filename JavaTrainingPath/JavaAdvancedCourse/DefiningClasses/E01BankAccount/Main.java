package JavaAdvancedCourse.DefiningClasses.E01BankAccount;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> vault = new HashMap<>();


        String input = scanner.nextLine();
        DecimalFormat moneyFormat = new DecimalFormat("#.##");

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s");


            String output = null;

            switch (tokens[0]) {
                case "Create":
                    BankAccount newAccount = new BankAccount();
                    int id = newAccount.getId();
                    vault.put(id, newAccount);
                    output = String.format("Account ID%d created", id);

                    break;

                case "Deposit":
                    id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    BankAccount depositAccount = vault.get(id);

                    if (depositAccount != null) {
                        depositAccount.deposit(amount);
                        output = String.format("Deposited %s to ID%d", moneyFormat.format(amount), id);

                    } else {
                        output = "Account does not exist";
                    }
                    break;

                case "SetInterest":
                    double interestRate = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interestRate);

                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    BankAccount current = vault.get(id);
                    if (current != null) {
                       output =String.format("%.2f", current.getInterest(years));

                    }else {
                        output= "Account does not exist";
                    }

                    break;

            }

            if (output!=null){
                System.out.println(output);
            }


            input= scanner.nextLine();
        }


    }
}
