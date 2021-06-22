package JavaOOPCourse.ReflectionAndAnnotations.Lab.E01Reflection;

import JavaOOPCourse.ReflectionAndAnnotations.Lab.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        try {
            Class<?> aClass = Class.forName("JavaOOPCourse.ReflectionAndAnnotations.Lab.Reflection");
            System.out.println(aClass.getName());

            System.out.println(aClass.getSuperclass().getName());

            Arrays.stream(aClass.getInterfaces()).forEach(i -> System.out.println(i.getName()));
            Object o = aClass.getConstructor().newInstance();
            System.out.println(o);

        } catch (ClassNotFoundException
                | NoSuchMethodException
                | InvocationTargetException
                | InstantiationException
                | IllegalAccessException e) {
            e.printStackTrace();
        }



       Class clazz = Reflection.class;

        System.out.println(clazz);

        Class superclass = clazz.getSuperclass();

        System.out.println(superclass);

        Class[] interfaces = clazz.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        declaredConstructor.setAccessible(true);

        Object o = declaredConstructor.newInstance("one", "two", "three");
        System.out.println(o.toString());

    }
}
