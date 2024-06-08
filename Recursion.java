//import java.util.*;

import javax.print.attribute.standard.MediaSize.ISO;

public class Recursion {

    //print num from n to 1
    public  static void PrintDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }

    //print num from 1 to n
    public static void PrintIncr(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintIncr(n-1);
        System.out.print(n+" " );
    }

    //factorial--time complexity and space complexity O(n)
    public static int Factorial(int n){
        
        if(n==0){
           return 1;
        }
       Factorial(n-1);
       int fact=n * Factorial(n-1);
       return fact;
    }

    //sum of n natural nums--time complexity and space complexity O(n)
    public static int SumOfn(int n){
        if(n==1){
            return 1;
        }
        SumOfn(n-1);
       int add= n +SumOfn(n-1);
       return add;
    }

    //first n fibonacci numbers--space complexity O(n) time complexity O(n^2)
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int a =Fib(n-1);
        int b =Fib(n-2);
        int sum=a+b;
        return sum;
    }

    //array sorted in ascending order or not?--time complexity and space complexity O(n)
    public static boolean IsSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr [i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr, i+1);
    }

    // first occurance 
    public static int FirstOccur(int arr[],int key,int i){
        
        if(i>arr.length-1){
           System.out.println("NOTFOUND");
           return -1;
        }
        if(key!=arr[i]){
             return FirstOccur(arr, key, i+1);
        }
        return i;
        
    }
    //last occurance
    public static void LastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            System.out.println("not found");
        }
        LastOccurence(arr, key, i);
        
    }


    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a decimal number");
        //  int n=sc.nextInt();
        //  int fact =Factorial(n);
        //  System.out.println(fact);
        // int sum=SumOfn(n);
        // System.out.println(sum);
        // int fibbo=Fib(n);
        // System.out.println(fibbo);
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key =5;
        int i=0;
      LastOccurence(arr, key, i);
    }
}
