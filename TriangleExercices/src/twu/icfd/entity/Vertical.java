package twu.icfd.entity;

public class Vertical implements Line{

    @Override
    public void printLine(int n) {
        for(int i = 0; i < n; i++){
            System.out.println(Asteristic.CHARACTER);
        }
    }
}
