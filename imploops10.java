//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
import java.util.*;
public class imploops10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers do u want to enter?");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE; //initializing the max with minimum value
        int min = Integer.MAX_VALUE;//initializing the min with maximum value
        for(int i=1;i<=n;i++){
            System.out.print("enter any number:");
            int a = sc.nextInt();
            if(a>max){
                max= a;
            }
            if(a<min){
                min=a;
            }
        }
        System.out.println("greastest value is:"+max);
        System.out.println("smallest value is:"+min);
    }
}
