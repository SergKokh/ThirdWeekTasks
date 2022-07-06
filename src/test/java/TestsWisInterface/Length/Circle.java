package TestsWisInterface.Length;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Circle implements FigureLength{

    double p = Math.PI;
    int radius = 10;


    @Test
    @Override
    public void length() {
        double l = radius * p * 2;
        System.out.println(l);
        Assert.assertEquals(l, 62.83);
    }

}
