package twu.tests.HorizontalLine;

import twu.icfd.entity.Horizontal;
import twu.icfd.util.InputReader;


public class DrawHorizontalLine {
    public static void main (String[] args){
        Horizontal horizontal = new Horizontal();
        InputReader reader =  new InputReader();

        int n = reader.getUserInput("try a number ");
        System.out.println();

        horizontal.printLine(n);
    }
}
