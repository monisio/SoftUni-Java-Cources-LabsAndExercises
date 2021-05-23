package JavaOOPCourse.Inheritance.Exercise.Animals.animals;

public enum AnimalSounds {

    DOG("Woof!"),
    CAT("Meow meow"),
    FROG("Ribbit"),
    KITTENS("Meow"),
    TOMCAT("MEOW");

    String sound;

    AnimalSounds(String sound){
       this.sound = sound;
    }


    public String getSound(){
        return this.sound;
    }
}
