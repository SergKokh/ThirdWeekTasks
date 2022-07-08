package TestsWisAbstractionsKlass;

public class Ferrari extends SportCars {


    @Override
    public String Car(String color, String engine, String power) {
        return sportCar();
    }

    @Override
    public String sportCar() {

        return null;
    }
}
