package TestsWisAbstractionsKlass;

import org.testng.annotations.Test;

public class BildHouse extends House{

    @Test
    public void bildHouse1(){
        System.out.println(numberOfWindows(2));
    }

    @Test
    public void bildHouse2() {
        System.out.println(numberOfWindows(7));
    }
}
