package JavaAdvancedCourse.Generics.E06GenericSwapMethod;

import java.util.List;

public class SwapList {

    public static <T> void swap(List<T> list, int indexOne, int indexTwo) {
        if (list == null || list.size() == 0) {
            throw new IllegalStateException("No elements");
        }

        list.set(indexOne, list.set(indexTwo,list.get(indexOne)));

    }

}
