//prime or not
import java.util.*;
public class primenumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number and ill tell whether it is prime or not:)");
    int n = sc.nextInt();
    if(n == 2){
        System.out.println("it is a prime");
    }
    else{
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){   
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime ==true){
            System.out.println("n is prime");
        }else{
            System.out.println("n is not prime");
        }
    }
    


  }  
}
