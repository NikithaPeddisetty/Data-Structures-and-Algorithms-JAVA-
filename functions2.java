//check if a number is prime or not using functions/methods
//this is wrong do it again
import java.util.*;
public class functions2{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                break;
            }
        }
        return isPrime;
    }
    public static void PrimesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Prime = isPrime(n);
        System.out.println(Prime);
    }
}
