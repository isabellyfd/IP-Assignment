package twu.icfd.entity;

public class Horizontal implements Line {

    @Override
    public void printLine(int n) {
        for(int i = 0; i < n; i++){
            System.out.print(Asteristic.CHARACTER);
        }
    }
}
