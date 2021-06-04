package JavaOOPCourse.InterfacesAndAbstraction.E05BorderControl;

public class Citizen implements Identifiable{

    private String name;
    private String id;

    private Integer age;

    public Citizen(String name,Integer age,  String id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public String getId() {
        return this.id;
    }
}
