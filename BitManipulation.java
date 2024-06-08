import java.util.*;
public class BitManipulation {
    
    //check if num is even or odd in the form of bits
    public static void evenorodd(int n){
        int bitMask=1;
        if( (n & bitMask) ==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    //get a  bit at i'th position
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask )!= 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    //set 1 at the i'th position
    public static void setIthBit(int n,int i){
        int BitMask=1<<i;
        System.out.println(n | BitMask);
    }

    //clear the value at ith position
    public static int clearIthBit(int n,int i){
        int BitMask=~(1<<i);
       // System.out.println(n & BitMask);
        return n & BitMask;
    }

    //update the bit with 0 or 1
    public static void UpdateBit(int n,int i,int bit){
        n= clearIthBit(n,i);
        int BitMask=bit<<i;
        System.out.println(n|BitMask);
        
    }

    //clear last i bits
    public static void ClearLastIbits(int n,int i){
        int BitMask=~(0)<<i;
        System.out.println(n & BitMask);
    }
    public static void main(String args[]){
        int n=15;
        //evenorodd(n);
         int i =2;
         //int bit=0;
        // int getithbit=getIthBit(n, i);
        // System.out.println(getithbit);
        //setIthBit(n,i);
        //clearIthBit(n, i);
        //UpdateBit(n, i, bit);
        ClearLastIbits(n,  i);

    }
}
