package twu.icfd.fizzbuzz;

public class GenerateFizzBuzzz {

   public void create(){
       int counter = 1;

       while (counter <= 100){
           if (Fizz.check(counter) && Buzz.check(counter)){
               System.out.println("FizzBuzz");
           }else if (Fizz.check(counter)){
               System.out.println("Fizz");
           }else if (Buzz.check(counter)){
               System.out.println("Buzz");
           }else {
               System.out.println(counter);
           }
           counter++;
       }
   }
}
