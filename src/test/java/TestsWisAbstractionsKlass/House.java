package TestsWisAbstractionsKlass;

public abstract class House {
    int windows;
    int flor;
    int doors;

    public int numberOfWindows(int windows) {
        if(windows < 5) {
            flor = 1;
            doors = 2;
            System.out.println("Windows " + windows + " Flor " + flor + " Doors " + doors);
        }
        else {
            flor = 2; doors = windows/3;
            System.out.println("Windows " + windows + " Flor " + flor + " Doors " + doors);
        }
        return windows;
    }

}
