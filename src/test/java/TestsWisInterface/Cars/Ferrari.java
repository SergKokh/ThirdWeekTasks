package TestsWisInterface.Cars;

import org.testng.annotations.Test;

public class Ferrari implements CarsParams{

    @Test
    public void paramsFerrari(){
        System.out.println("Params Ferrari");
        System.out.println(color());
        System.out.println(engine());
        System.out.println(power());
    }

    @Override
    public String color() {
        return "RED";
    }

    @Override
    public String engine() {
        return "V8";
    }

    @Override
    public String power() {
        return "540 PH";
    }
}
