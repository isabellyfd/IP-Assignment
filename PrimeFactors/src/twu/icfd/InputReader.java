package twu.icfd;

import java.util.Scanner;

public class InputReader {
    private Scanner in;

    InputReader(){
        this.in = new Scanner(System.in);
    }

    public int getUserInput(){
        return in.nextInt();
    }
}
