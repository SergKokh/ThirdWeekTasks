package TestsWisAbstractionsKlass;

import java.util.Comparator;

public abstract class Cars {
    String disel = "Disel";
    String benzin = "Benzin";
    String lamba = "LAMBA";
    String jeep = "JEEP";

    public abstract void whoAmI();

    public void sportCars(){
        System.out.println(lamba);
        System.out.println("Fuel " + benzin);
    }
    public void offRoadCars(){
        System.out.println(jeep);
        System.out.println("Fuel " + disel);
    }
}
