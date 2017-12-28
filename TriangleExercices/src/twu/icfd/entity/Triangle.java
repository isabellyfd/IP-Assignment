package twu.icfd.entity;

public class Triangle extends Shape {

    public Triangle(int size){
        super(size);
    }

    @Override
    public void draw() {
        for ( int i = 0; i < this.getSize(); i++){
            this.getPrinter().printLine( i + 1, Chars.ASTERISTICS);
            System.out.println();
        }
    }
}
