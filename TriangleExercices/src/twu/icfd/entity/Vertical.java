package twu.icfd.entity;

public class Vertical implements Line{

    @Override
    public void printLine(int n, String character) {
        for(int i = 0; i < n; i++){
            System.out.println(character);
        }
    }
}
