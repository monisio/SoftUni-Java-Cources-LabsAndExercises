package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E07CollectionHierarchy;

public class AddCollection extends Collection implements Addable  {


    public AddCollection() {
      super();
    }

    @Override
    public int add(String item) {


              data.add(item);
      return  data.indexOf(item);
    }
}
