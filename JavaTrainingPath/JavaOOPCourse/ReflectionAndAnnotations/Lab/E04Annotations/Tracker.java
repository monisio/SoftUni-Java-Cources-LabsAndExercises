package JavaOOPCourse.ReflectionAndAnnotations.Lab.E04Annotations;

import java.lang.reflect.Method;

public class Tracker {

    public static void printMethodByAuthor(Class<?> type, String searchedName) {
        Method[] declaredMethods = type.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            if (declaredMethod.isAnnotationPresent(Author.class)) {

                if(declaredMethod.getAnnotation(Author.class).name().equals(searchedName))
                System.out.println(declaredMethod.getName());
            }
        }

    }
}