package JavaAdvancedCourse.Generics.E02ArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] createArray(int length, T element) {
        //Works with usage of reflection only!
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = element;
        }
        return array;


    }


    public static <T> T[] createArray(Class<T> tClass, int length, T element) {

        T[] o = (T[]) Array.newInstance(tClass, length);

        Arrays.fill(o, element);
        return o;

    }

}
