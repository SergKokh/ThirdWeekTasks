package TestsWisInterface.Square;

import org.testng.annotations.Test;

public class Circle implements FigureSquare {
    double p = Math.PI;
    int radius = 5;

    @Test
    @Override
    public void plosha() {
        System.out.println(radius * radius * p /2);
    }
}
