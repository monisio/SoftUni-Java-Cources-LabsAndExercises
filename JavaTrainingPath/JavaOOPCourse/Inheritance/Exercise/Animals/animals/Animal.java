package JavaOOPCourse.Inheritance.Exercise.Animals.animals;

public class Animal {

    private String name;
    private int age;
    private String gender;

    public Animal(String name , int age , String gender){
        validateAge(age);

        this.name= name;
        this.age = age;
        this.gender= gender;

    }

    private void validateAge(int age) {
        if (age<=0){
            throw new IllegalArgumentException("Invalid input!");
        }

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String produceSound(){
      return  AnimalSounds.valueOf(this.getClass().getSimpleName().toUpperCase()).getSound();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %s %s%n%s"
                ,this.getClass().getSimpleName()
                ,getName()
                ,getAge(),
                getGender(),produceSound());
    }
}
