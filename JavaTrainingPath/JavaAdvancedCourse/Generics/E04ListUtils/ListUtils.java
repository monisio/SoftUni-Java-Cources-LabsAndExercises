package JavaAdvancedCourse.Generics.E04ListUtils;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    private static <T> void checkIfEmpty(List<T> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalStateException("List is empty");
        }

    }

    public static <T extends Comparable<T>> T getMin(List<T> container) {
        checkIfEmpty(container);

        return Collections.min(container);


    }

    public static <T extends Comparable<T>> T getMax(List<T> container) {
        checkIfEmpty(container);

        return Collections.max(container);


    }


}
