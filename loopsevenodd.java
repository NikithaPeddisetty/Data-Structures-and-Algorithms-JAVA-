//Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
import java.util.*;
public class loopsevenodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a set of numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        if(sum%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
