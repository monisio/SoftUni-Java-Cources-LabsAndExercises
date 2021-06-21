package JavaOOPCourse.ReflectionAndAnnotations.Lab.E02;

import JavaOOPCourse.ReflectionAndAnnotations.Lab.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class GettersAndSetters {
    public static void main(String[] args) throws Exception {

            Class<Reflection> clazz = Reflection.class;
        Method[] methods = clazz.getDeclaredMethods();  // invoke with Declared method otherwise not all methods will be called,
                                                       // and Object as superClass methods will be visible example Object.getClass method

        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));

        for (Method method : methods) {
            String methodName = method.getName();
            if(methodName.contains("set")){
                setters.add(method);
            }else if(methodName.contains("get")){
                getters.add(method);
            }

        }

        getters.forEach(m-> System.out.println(m.getName()+ " will return " + m.getReturnType().getSimpleName()));
        setters.forEach(m-> System.out.println(m.getName()+ " will set field of type " + Arrays.toString(m.getParameterTypes()).replaceAll("[\\[\\]]","")));

    }
}
