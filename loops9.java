//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;
public class loops9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers do u like to enter?");
        int n= sc.nextInt();
        int postivecount=0;
        int negativecount=0;
        int zerocount=0;
        int i=1;
        int a;
        while(i<=n){
            System.out.print("enter any number:");
            a = sc.nextInt();   
        if(a>0){
            postivecount=postivecount+1;
            //System.out.println("there are "+postivecount+" postive numbers");
        }
        else if(a<0){
            negativecount=negativecount+1;
            //System.out.println("there are "+negativecount+" negative numbers");
        }
        else{
            zerocount=zerocount+1;
            //System.out.println("there are "+zerocount+" Zeroes");
            
        }
           
            i++;    
        }
        System.out.println("there are "+postivecount+" postive numbers");
        System.out.println("there are "+negativecount+" negative numbers");
        System.out.println("there are "+zerocount+" Zeroes");
    }
}
