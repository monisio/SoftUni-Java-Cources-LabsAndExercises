package JavaOOPCourse.ExceptionsAndErrorHandling.E04ValidPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName , String lastName,int age ){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    private void setFirstName(String firstName) {
        checkNameInput(firstName, "first");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
       checkNameInput(lastName , "last");
        this.lastName = lastName;
    }

    private void checkNameInput(String name , String callerMethodName){
        if (name==null || name.isBlank()){
            throw new IllegalStateException("The "+callerMethodName+" name cannot be null or empty");
        }

    }

    private void setAge(int age) {
        if(age<1||age>120){
            throw new IllegalArgumentException("Age should be in range [1....120]");
        }

        this.age = age;
    }
}
