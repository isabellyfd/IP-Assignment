package twu.tests.DrawDiamond;

import twu.icfd.entity.NamedDiamond;
import twu.icfd.util.InputReader;

public class DrawNamedDiamond {

    public static void main(String[] args){
        InputReader reader = new InputReader();

        int size = reader.getUserInput("enter the size of the diamond:");
        System.out.println();
        String name = reader.getUserName("enter your name:");
        System.out.println();

        new NamedDiamond(size, name).draw();

    }
}
