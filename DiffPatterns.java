//( Very imp --0-1 triangle line 49 )
import java.util.*;
public class DiffPatterns {
    //printing a hollow_Rectangle
    public static void hollow_Rectangle(int Rows,int Colms){
        for(int i=1;i<=Rows;i++){       //defining num of rows
            for(int j=1;j<=Colms;j++){  //defining num of columns
                if(i==1||i==Rows||j==1||j==Colms){   //setting the boundery
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //Inverted or Rotated Half_Pyramid
    public static void InvRotHalfPyr(int Rows){
        for(int i=1;i<=Rows;i++){
            for(int Space=1;Space<=Rows-i;Space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Inverted half Pyramid with numbers
    public static void NumPyr(int Lines){
        for(int i=0;i<Lines;i++){
            for(int n=1;n<=Lines-i;n++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
    //Floyd's Triangle pattern
    public static void FloydsTriangle(int n){
        int Counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Counter+" ");
                Counter++;
            }
            System.out.println();
        }
    }
    //0-1 Triangle Pattern
    public static void binTriangle(int Rows){
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    //Butterfly pattern
    public static void Butterfly(int Rows){
        //first half
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(Rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=Rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(Rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    // Solid Rhombus pattern
    public static void SolidRhombus(int Rows){
        for(int i=1;i<=Rows;i++){
            //spaces
            for(int j=1;j<=Rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=Rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Diamond pattern
    public static void Diamond(int Rows){
        //first half
        for(int i=1;i<=Rows;i++){
            //space-(Rows-i)
            for(int j=1;j<=Rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        //second half
        for(int i=Rows;i>=0;i--){
            for(int j=1;j<=Rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Rows=sc.nextInt();
        //int Colms=sc.nextInt();
        //hollow_Rectangle(Rows, Colms);
        //InvRotHalfPyr(Rows);
        //NumPyr(Lines);
        //int n=sc.nextInt();
        //FloydsTriangle(n);
        //binTriangle(Rows);
        //SolidRhombus(Rows);
        Diamond(Rows);
        
    }
}
