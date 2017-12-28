package twu.tests.VerticalLine;

import twu.icfd.entity.Vertical;
import twu.icfd.util.InputReader;

public class DrawVerticalLine {
    public static void main(String[] args){
        Vertical vertical = new Vertical();
        InputReader reader =  new InputReader();

        int n = reader.getUserInput("try a number ");
        System.out.println();

        vertical.printLine(n);

    }
}
