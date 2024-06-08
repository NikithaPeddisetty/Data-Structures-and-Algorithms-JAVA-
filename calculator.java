import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        double a = sc.nextDouble();
        System.out.println("enter a number ");
        double b = sc.nextDouble();
        System.out.println("enter an operator ( +,-,%,/,*) ");
        char operator = sc.next().charAt(0);
        switch(operator){
        case '+': System.out.println(a + b);
                    break;
        case '-':System.out.println(a - b);
                    break;
        case '*':System.out.println(a *b);
                    break;
        case '/':if(b == 0){
                    System.out.println("undefined");
                 }
                 else{
                    System.out.println(a / b);
                 }
                    break;
        case '%':System.out.println(a % b);
                    break;
        default:System.out.println("cant solve");

                }

    }
}
