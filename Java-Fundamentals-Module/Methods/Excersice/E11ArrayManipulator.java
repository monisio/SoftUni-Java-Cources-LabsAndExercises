package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] intArray = getInputToIntArray(input);

        String commandLine = scanner.nextLine();


        while (!commandLine.equals("end")) {

            String[] command = commandLine.split(" ");

            if (command[0].equals("exchange")) {

                int index = Integer.parseInt(command[1]);
                if (index <= intArray.length - 1 && index >= 0) {
                    getExchange(index, intArray);

                } else {
                    System.out.println("Invalid index");
                }


            } else if (command[0].equals("max")) {


                int index = getMaxEvenOddIndex(command[1], intArray);

                if (index != -1) {
                    System.out.println(index);
                } else {

                    System.out.println("No matches");
                }

            } else if (command[0].equals("min")) {
                int index = getMinEvenOddIndex(command[1], intArray);

                if (index != -1) {
                    System.out.println(index);
                } else {

                    System.out.println("No matches");
                }

            } else if (command[0].equals("first") || command[0].equals("last")) {
                int counts = Integer.parseInt(command[1]);
                boolean isContainRealZero = checkIfContainRealZeros(intArray);

                if (counts <= intArray.length) {

                    if (command[0].equals("first")) {
                        getFirstEvenOdd(command[2], counts, intArray, isContainRealZero);
                    } else {
                        getLastEvenOdd(command[2], counts, intArray, isContainRealZero);
                    }
                    System.out.println();
                } else {
                    System.out.println("Invalid count");

                }


            }


            commandLine = scanner.nextLine();
        }


        printArrayFinalState(intArray);


    }

    private static boolean checkIfContainRealZeros(int[] intArray) {
        boolean isContain = false;
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] == 0) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    private static void getFirstEvenOdd(String evenOdd, int counts, int[] intArray, boolean isContain) {

        int evenOddCount = getEvenOdd(evenOdd, intArray);

        if (evenOddCount < counts) {
            counts = evenOddCount;
        }

        int[] evenOddNumbersArray = new int[counts];


        int indexReached = 0;


        if (evenOdd.equals("even")) {


            for (int i = 0; i < evenOddNumbersArray.length; i++) {

                for (int j = indexReached; j < intArray.length; j++) {
                    indexReached++;
                    if (intArray[j] % 2 == 0 && counts > 0) {

                        evenOddNumbersArray[i] = intArray[j];
                        counts--;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < evenOddNumbersArray.length; i++) {

                for (int k = indexReached; k < intArray.length; k++) {
                    indexReached++;
                    if (intArray[k] % 2 != 0 && counts > 0) {

                        evenOddNumbersArray[i] = intArray[k];
                        counts--;
                        break;

                    }

                }
            }

        }


        printArrayFinalState(evenOddNumbersArray);


    }

    private static int getEvenOdd(String evenOdd, int[] intArray) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        if (evenOdd.equals("even")) {
            return even;
        } else {
            return odd;
        }
    }

    private static void getLastEvenOdd(String evenOdd, int counts, int[] intArray, boolean isContain) {

        int evenOddCount = getEvenOdd(evenOdd, intArray);

        if (evenOddCount < counts) {
            counts = evenOddCount;
        }

        int[] evenOddNumbersArray = new int[counts];


        boolean isContainZero = false;

        int indexReached = intArray.length - 1;
        if (evenOdd.equals("even")) {
            for (int i = evenOddNumbersArray.length - 1; i >= 0; i--) {

                for (int j = indexReached; j >= 0; j--) {
                    indexReached--;
                    if (intArray[j] % 2 == 0 && counts > 0) {

                        evenOddNumbersArray[i] = intArray[j];
                        counts--;
                        break;
                    }
                }
            }
        } else {
            for (int i = evenOddNumbersArray.length - 1; i >= 0; i--) {

                for (int k = indexReached; k >= 0; k--) {
                    indexReached--;
                    if (intArray[k] % 2 != 0 && counts > 0) {

                        evenOddNumbersArray[i] = intArray[k];
                        counts--;
                        break;

                    }

                }
            }

        }


        printArrayFinalState(evenOddNumbersArray);


    }


    private static void printArrayFinalState(int[] intArray) {
        System.out.print("[");

        for (int i = 0; i < intArray.length; i++) {

            if (i < intArray.length - 1) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.print(intArray[i]);
            }
        }

        System.out.print("]");
    }


    private static int getMinEvenOddIndex(String evenOdd, int[] intArray) {
        int minEvenIndex = -1;
        int minEvenNumber = Integer.MAX_VALUE;
        int minOddIndex = -1;
        int minOddNumber = Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {


            if (intArray[i] <= minEvenNumber && intArray[i] % 2 == 0) {
                minEvenNumber = intArray[i];
                minEvenIndex = i;
            }

            if (intArray[i] <= minOddNumber && intArray[i] % 2 != 0) {
                minOddNumber = intArray[i];
                minOddIndex = i;
            }

        }

        if (evenOdd.equals("even")) {
            return minEvenIndex;
        } else {
            return minOddIndex;
        }
    }


    private static int getMaxEvenOddIndex(String evenOdd, int[] intArray) {


        int maxEvenIndex = -1;
        int maxEvenNumber = Integer.MIN_VALUE;
        int maxOddIndex = -1;
        int maxOddNumber = Integer.MIN_VALUE;

        for (int i = 0; i < intArray.length; i++) {


            if (intArray[i] >= maxEvenNumber && intArray[i] % 2 == 0) {
                maxEvenNumber = intArray[i];
                maxEvenIndex = i;
            }

            if (intArray[i] >= maxOddNumber && intArray[i] % 2 != 0) {
                maxOddNumber = intArray[i];
                maxOddIndex = i;
            }


        }

        if (evenOdd.equals("even")) {
            return maxEvenIndex;
        } else {
            return maxOddIndex;
        }


    }

    private static void getExchange(int index, int[] intArray) {

        // 1 2 3 4 5 ->  4 5 1 2 3


        for (int i = 0; i <= index; i++) {
            int current = intArray[0];

            for (int j = 0; j < intArray.length; j++) {

                if (j + 1 < intArray.length) {
                    intArray[j] = intArray[j + 1];
                }


            }
            intArray[intArray.length - 1] = current;
        }

/*
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");


        }*/
    }

    private static int[] getInputToIntArray(String[] input) {

        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(input[i]);


        }


        return array;
    }
}
