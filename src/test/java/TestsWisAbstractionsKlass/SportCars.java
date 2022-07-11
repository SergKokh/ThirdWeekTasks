package TestsWisAbstractionsKlass;

import org.testng.annotations.Test;

public class SportCars extends Cars{

    @Test
    public void carLamba(){
        int doors = 2;
        String power = "450 hp";
        sportCars();
        System.out.println("Doors " + doors);
        System.out.println("Power " + power);
    }
    @Test
    public void carLamba1(){
        int doors = 3;
        String power = "570 hp";
        sportCars();
        System.out.println("Doors " + doors);
        System.out.println("Power " + power);
    }

    @Override
    public void whoAmI() {

    }
}
