import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line=1;line<=n;line++){
            for(int star=n;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
