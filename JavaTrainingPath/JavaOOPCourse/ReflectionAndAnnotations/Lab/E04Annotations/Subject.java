package JavaOOPCourse.ReflectionAndAnnotations.Lab.E04Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//NOTE : Reflection can reflect runtime retention annotation otherwise they are not compiled and visible for reflection

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE ,ElementType.CONSTRUCTOR})
public @interface Subject {
    String [] categories ();
}

