package TestsWisInterface.Length;

import org.testng.annotations.Test;

public class Kvadrat implements FigureLength{

    int side = 10;

    @Test
    @Override
    public void length() {
        System.out.println(side * 4);

    }
}
