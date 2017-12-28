package twu.icfd.entity;

public class IsocelesTriangle  extends Triangle {

    public IsocelesTriangle(int size){
        super(size);
    }

    @Override
    public void draw() {

        int base = ((2 * this.getSize()) - 1);

        for(int j = 1, i = base/2; j <= base ; j += 2, i--) {
            this.getPrinter().printLine(i , Chars.SPACE);
            this.getPrinter().printLine(j, Chars.ASTERISTICS);
            System.out.println();
        }
    }
}
