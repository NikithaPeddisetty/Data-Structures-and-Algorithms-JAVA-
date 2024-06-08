//print the largest of 3 number
import java.util.*;
public class ifelse1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a >c){
            System.out.println(a + " is the largest integer");
        }
        else if(b>a && b>c){
            System.out.println(b + "is the largest number");
        }
        else if(c>a && c>b){
            System.out.println(c + "is the largest number");
        }
        else{
            System.out.println("all are equal");
        }
    }
    
}