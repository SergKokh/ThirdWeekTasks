package TestsWisInterface.Square;

import TestsWisInterface.Square.FigureSquare;
import org.testng.annotations.Test;

public class Rectangle implements FigureSquare {

    int length = 10;
    int width = 5;

    @Test
    @Override
    public void plosha() {
        System.out.println("Square rectangle " + " " +length * width);
    }
}
