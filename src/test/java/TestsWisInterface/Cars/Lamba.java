package TestsWisInterface.Cars;

import org.testng.annotations.Test;

public class Lamba implements CarsParams {


    @Test
    public void paramsLamba(){
        System.out.println("Params Lamba");
        System.out.println(color());
        System.out.println(engine());
        System.out.println(power());

    }

    @Override
    public String color() {
        return "Yellow";
    }

    @Override
    public String engine() {
        return "V10";
    }

    @Override
    public String power() {
        return "720 PH";
    }

}
