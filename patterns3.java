import java.util.*;
public class patterns3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c ='a';
        for(int line=1;line<=n;line++){
            for(int characters=1;characters<=line;characters++){
            System.out.print(c);
            c++;
        }
            System.out.println();
    }
}
}