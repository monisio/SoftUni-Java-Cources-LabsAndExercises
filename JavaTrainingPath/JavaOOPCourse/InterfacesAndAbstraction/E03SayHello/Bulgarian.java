package JavaOOPCourse.InterfacesAndAbstraction.E03SayHello;

import JavaOOPCourse.InterfacesAndAbstraction.E04SayHelloExtended.BasePerson;

public class Bulgarian extends BasePerson implements Person {


    public Bulgarian(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Здравей";
    }
}
