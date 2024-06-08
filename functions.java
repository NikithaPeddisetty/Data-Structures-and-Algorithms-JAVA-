//binomial coefficient
import java.util.*;
public class functions {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int a){
        int factorialof=1;
        for(int i=1;i<=a;i++){
            factorialof=factorialof*i;
        }
        //System.out.println(factorialof);
        return factorialof;
    }
    public static int bincoef(int n,int r){
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int fact_nmr=factorial(n-r);
        int result = fact_n/(fact_r*fact_nmr);
        return result;
    }
    public static void main(String args[]){
        //int a = 2;
        //int b =7;
        //int prod = multiply(a,b);
        //System.out.println(prod);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bincoef(n,r));
    }
}