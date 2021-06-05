package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E07CollectionHierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");


        Addable addCollection = new AddCollection();
        AddRemovable addRemovable = new AddRemoveCollection();
        MyList myList = new MyListImpl();


        List<Addable> add = new ArrayList<>();

        add.add(addCollection);
        add.add(addRemovable);
        add.add(myList);

        for (Addable addable : add) {
            int[] output = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                output[i] = addable.add(input[i]);
            }
            System.out.println(Arrays.toString(output).replaceAll("[\\[\\],]", ""));

        }

        int removeAmount = Integer.parseInt(scanner.nextLine());

        List<AddRemovable> addRemovables = new ArrayList<>();

        addRemovables.add(addRemovable);
        addRemovables.add(myList);

        for (AddRemovable removable : addRemovables) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < removeAmount; i++) {
                sb.append(removable.remove());
                sb.append(" ");

            }
            System.out.println(sb.toString());
        }


    }


}
