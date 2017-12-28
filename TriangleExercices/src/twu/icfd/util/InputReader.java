package twu.icfd.util;

import java.util.Scanner;

public class InputReader {
    private Scanner in;

    public InputReader() {
        this.in = new Scanner(System.in);
    }

    public int getUserInput(String message){
        System.out.println(message);
        return in.nextInt();
    }

    public int getUserInput(){
        return in.nextInt();
    }
}
