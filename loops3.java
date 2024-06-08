//reverse the number
import java.util.*;
public class loops3 {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    for(;n>0;n = n/10){
       
        int lastdigit = n%10;
        
        rev = (rev*10) + lastdigit;
        System.out.print(lastdigit);
        
    }
    System.out.println( " " + rev);

   } 
}
