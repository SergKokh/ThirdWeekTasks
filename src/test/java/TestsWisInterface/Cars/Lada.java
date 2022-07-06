package TestsWisInterface.Cars;

import org.testng.annotations.Test;

public class Lada implements CarsParams{

    @Test
    public void paramsFerrari(){
        System.out.println("Params Lada");
        System.out.println(color());
        System.out.println(engine());
        System.out.println(power());
    }

    @Override
    public String color() {
        return "Rusty";
    }

    @Override
    public String engine() {
        return "R4";
    }

    @Override
    public String power() {
        return "55 PH";
    }
}
