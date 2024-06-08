//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
import java.util.*;
public class dowhile{
    public static void main(String args[]){
        char c;
    do{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        System.out.println("do you wish to run the operation one more time.if yes type 'y or Y'.?");
        c = sc.next().charAt(0);
        }while(c=='y'||c=='Y');
    }
}

