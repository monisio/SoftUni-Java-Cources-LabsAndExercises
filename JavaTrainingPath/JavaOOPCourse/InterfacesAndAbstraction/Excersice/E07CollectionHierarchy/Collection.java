package JavaOOPCourse.InterfacesAndAbstraction.Excersice.E07CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    protected static final int DEFAULT_FIRST_INDEX = 0;

    protected final int maxSize = 100;

    protected List<String> data;

    protected Collection() {
        this.data = new ArrayList<>();
    }
}
