package Fundamentals.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestTrainDifferentApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = inputToIntList(scanner);

        int maxCapacityOfWagon = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {

            if ("Add".equals(command[0])) {
                int newWagon = Integer.parseInt(command[1]);
                addWagonToTrain(train, newWagon);
            } else {
                int passengersAdded = Integer.parseInt(command[0]);
                addPassengers(train, maxCapacityOfWagon, passengersAdded);
            }

            command = scanner.nextLine().split(" ");
        }


        for (int wagon : train) {
            System.out.print(wagon + " ");
        }


    }

    private static void addPassengers(List<Integer> train, int maxCapacity, int newPassengers) {

        int wagonNumber = 0;

        while (newPassengers > 0 && wagonNumber < train.size()) {


            if (train.get(wagonNumber) < maxCapacity) {
                // how much space do we have until full
                int peopleGetIn = maxCapacity - train.get(wagonNumber);
                if (peopleGetIn > newPassengers) {
                    train.set(wagonNumber, train.get(wagonNumber) + newPassengers);


                } else {


                    train.set(wagonNumber, (train.get(wagonNumber) + peopleGetIn));
                }


                newPassengers -= peopleGetIn;
            }


            wagonNumber++;
        }


    }

    private static void addWagonToTrain(List<Integer> train, int newWagon) {

        train.add(train.size(), newWagon);

    }

    private static List<Integer> inputToIntList(Scanner scanner) {

        String[] input = scanner.nextLine().split(" ");

        List<Integer> inputToList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            inputToList.add(Integer.parseInt(input[i]));

        }

        return inputToList;
    }
}


