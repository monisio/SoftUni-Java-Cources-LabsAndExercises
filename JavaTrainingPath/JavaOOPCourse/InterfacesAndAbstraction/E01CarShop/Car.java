package JavaOOPCourse.InterfacesAndAbstraction.E01CarShop;

import java.io.Serializable;

public interface Car  extends Serializable {
    Integer TYRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
