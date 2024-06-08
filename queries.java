import java.util.*;
public class queries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int result = 1;
        int term = a +b;
        System.out.print(term+" ");
        for(int i=1;i<n;i++){
            result = result*2;
            term = term + (result*b);
            System.out.print(term+" ");
        }
        

    }
}
