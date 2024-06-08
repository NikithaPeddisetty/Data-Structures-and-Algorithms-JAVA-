import java.util.*;
public class ternaryoperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();
        String result = (marks>33)? "pass" :"fail";
        System.out.println(result);
    }
}
