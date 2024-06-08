import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
         while(true){
            if(n==5){

            }
            else{
            if(-127<=n && n<=128){
            System.out.println(n+" can be fitted in:");
            System.out.println("*"+" "+"byte" );        
             }
            else if(n>=-32768 && n<=32767){
            System.out.println(n+" can be fitted in:");
            System.out.println("*"+" "+"short");
            }
            else if(n>=-2147483648 && n<=2147483647){
            System.out.println(n+" can be fitted in:");
            System.out.println("*"+" "+"int");

            }
            else if(n>=-9.223372e+18  && n<=9.223372e+18 ){
            System.out.println(n+" can be fitted in:");
            System.out.println("*"+" "+"long");
            
        
            }
            
        }
        }
        }
    }
