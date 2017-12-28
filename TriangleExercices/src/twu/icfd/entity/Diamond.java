package twu.icfd.entity;

public class Diamond extends Shape {

    public Diamond(int size){
        super(size);
    }

    @Override
    public void draw() {

        int base = ((2 * this.getSize()) - 1);
        int numberOfSpaces = base/2;

        for(int j = 1; j <= base ; j += 2, numberOfSpaces--) {
            this.getPrinter().printLine(numberOfSpaces , Chars.SPACE);
            this.getPrinter().printLine(j, Chars.ASTERISTICS);
            System.out.println();
        }

        numberOfSpaces = 1;
        for (int j = (base / 2); j >= 0 ; j -= 2, numberOfSpaces++){
            this.getPrinter().printLine(numberOfSpaces, Chars.SPACE);
            this.getPrinter().printLine(j+1, Chars.ASTERISTICS);
            System.out.println();
        }
    }
}
