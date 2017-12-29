package twu.icfd;

public class Prime {

    public static int nextPrime(int number){

        int prime = number + 1;

        while (!isPrime(prime)){
            prime++;
        }

        return prime;
    }

    private static boolean isPrime(int number){
        int count = 2;

        while ( count < number && number % count != 0){
            count++;
        }

        return (count == number);
    }
}
