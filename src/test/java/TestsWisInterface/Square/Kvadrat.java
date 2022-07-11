package TestsWisInterface.Square;

import TestsWisInterface.Square.FigureSquare;
import org.testng.annotations.Test;

public class Kvadrat implements FigureSquare {
    int side = 7;

    @Override
    @Test
    public void plosha() {
        System.out.println(side*side);
    }
}
