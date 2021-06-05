package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E07CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {



    public AddRemoveCollection() {
        super();
    }

    @Override
    public int add(String item) {
        data.add(DEFAULT_FIRST_INDEX,item);
        return DEFAULT_FIRST_INDEX;
    }

    @Override
    public String remove() {
        String toBeRemoved = data.get(data.size()-1);
        data.remove(data.size()-1);
        return toBeRemoved;
    }
}
