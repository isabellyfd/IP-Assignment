package twu.tests.DrawDiamond;

import twu.icfd.entity.Diamond;
import twu.icfd.util.InputReader;

public class DrawNormalDiamond {
    public static void main(String [] args){
        InputReader reader = new InputReader();
        int size =  reader.getUserInput("enter the size of the diamond:");

        new Diamond(size).draw();

    }
}
