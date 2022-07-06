package TestsWisInterface.Length;

import org.testng.annotations.Test;

public class Rectangle implements FigureLength{

    int length = 8;
    int width = 5;

    @Test
    @Override
    public void length() {
        System.out.println((length + width) * 2);

    }
}
