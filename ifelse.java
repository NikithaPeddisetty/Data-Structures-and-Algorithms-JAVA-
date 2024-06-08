//income tax

import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your salary?");
        double income = sc.nextDouble();
        if(income< 500000){
             System.out.println("0% income tax");
        }
        else if(income>5000 && income< 1000000){
            double tax = income * 0.2;
        System.out.println("your income tax is " + tax);
            }
        else {
            double tax = income * 0.3;
            System.out.println("your income tax is " + tax );
        }


    }
}
