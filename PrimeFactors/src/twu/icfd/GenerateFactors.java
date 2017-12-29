package twu.icfd;

import java.util.TreeSet;

public class GenerateFactors {


    public void generate(int number){
        TreeSet<Integer> set = new TreeSet<>();

        int prime = Prime.nextPrime(0);

        while (prime <= number){
            if (number % prime == 0){
                number /= prime;
                set.add(prime);
            }else {
                prime = Prime.nextPrime(prime);
            }
        }

       if (set.isEmpty()){
            System.out.println("there's no prime factor! sorry :(");
       }else {
           for (Integer factor : set){
               System.out.print(factor + " ");
           }
       }

    }
}
