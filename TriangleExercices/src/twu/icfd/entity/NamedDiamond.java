package twu.icfd.entity;

public class NamedDiamond extends Diamond {

    private String name;

    public NamedDiamond(int size, String name){
        super(size);
        this.name = name;
    }

    @Override
    public void draw() {
        int base = ((2 * this.getSize()) - 1);
        int numberOfSpaces = base/2;

        for(int j = 1; j <= base - 2 ; j += 2, numberOfSpaces--) {
            this.getPrinter().printLine(numberOfSpaces , Chars.SPACE);
            this.getPrinter().printLine(j, Chars.ASTERISTICS);
            System.out.println();
        }

        System.out.println(this.name);

        numberOfSpaces = 1;
        for (int j = (base / 2); j >= 0 ; j -= 2, numberOfSpaces++){
            this.getPrinter().printLine(numberOfSpaces, Chars.SPACE);
            this.getPrinter().printLine(j+1, Chars.ASTERISTICS);
            System.out.println();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
