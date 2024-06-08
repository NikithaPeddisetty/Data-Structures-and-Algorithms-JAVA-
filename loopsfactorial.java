//Write a program to find the factorialof any number entered by the user
import java.util.*;
public class loopsfactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int factorialof = 1;
        if(n==0){
            System.out.println("1");
        }
        else if(n == 1){
            System.out.println("1");
        }
        else{
           
        for(int i=1;i<=n;i++){
             factorialof = factorialof*i;
        
            
              
        }
        System.out.println(factorialof);
    }
    
}
}
