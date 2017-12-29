package twu.icfd;

public class PrimeTestDrive {
    public static void  main(String[] args){

        InputReader reader = new InputReader();

        int number = reader.getUserInput();

        new GenerateFactors().generate(number);

    }
}
