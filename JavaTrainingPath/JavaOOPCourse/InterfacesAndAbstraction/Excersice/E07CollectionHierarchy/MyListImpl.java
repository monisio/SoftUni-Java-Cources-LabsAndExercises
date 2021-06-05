package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E07CollectionHierarchy;

public class MyListImpl extends Collection implements MyList {

    public MyListImpl(){
        super();
    }

    @Override
    public int add(String item) {
        data.add(DEFAULT_FIRST_INDEX,item);
        return DEFAULT_FIRST_INDEX;
    }

    @Override
    public String remove() {
        String toBeRemoved= data.get(DEFAULT_FIRST_INDEX);
        data.remove(DEFAULT_FIRST_INDEX);
        return  toBeRemoved;
    }

    @Override
    public int getUsed() {
        return data.size();
    }
}
