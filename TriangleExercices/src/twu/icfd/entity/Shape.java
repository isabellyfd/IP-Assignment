package twu.icfd.entity;

public abstract class Shape {

    private int size;
    private Horizontal printer;

    public Shape(int size){
        this.size = size;
        this.printer = new Horizontal();
    }

    public abstract void draw();

    public Horizontal getPrinter() {
        return printer;
    }

    public void setPrinter(Horizontal printer) {
        this.printer = printer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
