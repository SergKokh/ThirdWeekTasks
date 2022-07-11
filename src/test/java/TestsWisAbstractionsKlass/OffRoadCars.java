package TestsWisAbstractionsKlass;

import org.testng.annotations.Test;

public class OffRoadCars extends Cars{

    @Test
    public  void carCheeroki(){
         int doors = 3;
         String power = "160 hp";
         offRoadCars();
        System.out.println("Doors " + doors);
        System.out.println("Power " + power);
    }

    @Test
    public void carGrandCheeroki(){
        int doors = 5;
        String power = "200 hp";
        offRoadCars();
        System.out.println("Doors " + doors);
        System.out.println("Power " + power);
    }

    @Override
    public void whoAmI() {

    }
}
