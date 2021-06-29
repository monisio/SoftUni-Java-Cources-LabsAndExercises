package JavaOOPCourse.ExceptionsAndErrorHandling.E04ValidPerson;

public class Main {
    public static void main(String[] args) {


        try{

            Person person = new Person("joakin", "kirov", 122);
        }catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " +e.getMessage());
        }

    }
}
