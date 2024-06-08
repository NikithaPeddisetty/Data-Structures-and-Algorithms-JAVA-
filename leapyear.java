import java.util.*;
public class leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year %4 != 0){
            System.out.println("its  not a leap year");
        }
        else if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("its a leap year");
            }
            else{
                System.out.println("its not a leap year");
            }
        }
        else if(year % 100 != 0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
        }



    }

