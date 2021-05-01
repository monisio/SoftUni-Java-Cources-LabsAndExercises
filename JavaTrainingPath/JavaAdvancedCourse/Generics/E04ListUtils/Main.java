package JavaAdvancedCourse.Generics.E04ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }


        System.out.println(ListUtils.getMin(list));
        System.out.println(ListUtils.getMax(list));;
    }
}
