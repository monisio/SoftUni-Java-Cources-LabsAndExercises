package JavaOOPCourse.Inheritance.Exercise.Animals.animals;

public class Tomcat extends Cat{

    private static final String GENDER = "Male";

    public Tomcat(String name , int age , String gender){
        super(name, age,GENDER);
    }
}
