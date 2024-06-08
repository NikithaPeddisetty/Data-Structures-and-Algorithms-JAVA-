//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

import java.util.*;
public class power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;
        for(int i=1;i<=exponent;i++){
            result = result*base;
        }
        System.out.println(result);
    }
}
