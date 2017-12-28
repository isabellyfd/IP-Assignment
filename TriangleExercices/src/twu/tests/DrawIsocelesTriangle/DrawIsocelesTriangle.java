package twu.tests.DrawIsocelesTriangle;

import twu.icfd.entity.IsocelesTriangle;
import twu.icfd.util.InputReader;

public class DrawIsocelesTriangle {
    public static void main(String [] args){
        InputReader reader = new InputReader();

        int size = reader.getUserInput("enter the size: ");
        new IsocelesTriangle(size).draw();
    }
}
