public class Arrays {
 /*linear search for a key
      Time Complexity =O(n)*/
    public static int LinearSearch(String fruits[],String key){
        for(int i=0;i<fruits.length;i++){
           if(fruits[i]==key){
            System.out.println("the key is found at index : "+ i);
           return i;
        }
        }
        return -1;
    }
 //Finding the largest and smallest values
    public static int MinandMax(int Values[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0;i<Values.length;i++){
            if(Values[i]>Largest){
                Largest = Values[i];
            }
            if(Values[i]<Smallest){
                Smallest = Values[i];
            }
        }
        System.out.println("the Largest Value is: "+ Largest);
        System.out.println("the Smallest Value is: "+Smallest);
        return Smallest;
    }
 //binary search
    public static int BinarySearch(int Values[],int key){
        int Start =0,end=Values.length-1;
        while(Start<=end){
            int mid = (Start+end)/2;
            if(Values[mid]==key){//found
                return mid;
            }
            if(Values[mid]>key){//left half 
                end = mid-1;
            }
            else{//right half
                Start = mid+1;
            }
        }
        return -1;
    }
//Reverse an array
    public static void RevArray(int Values[]){
        int Start=0,end=Values.length-1;
        while(Start<end){
            //swap
            int temp=Values[end];
            Values[end]=Values[Start];
            Values[Start]=temp;
            Start++;
            end--;
        }
        //printing the updated array
        for(int i=0;i<=Values.length;i++){
            System.out.print(Values[i]+" ");
        }
        //System.out.println(Values);
    }
//print pairs of Array
    public static void PrintPairs(int Values[]){
        for(int i=0;i<=Values.length;i++){
            for(int j=i+1;j<=Values.length;j++){
                System.out.print("("+Values[i]+","+Values[j]+")"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        //String fruits[]={"mango","apples","oranges","banana","litchy"};
        //String key="banana";
        //LinearSearch(fruits,key);
        //int index =LinearSearch(fruits, key);
        //if(index ==-1){
          //  System.out.println("Key NOTFOUND");
        int Values[] ={1,4,6,7,9,10,33};
        //int key= 33;
        //System.out.println("the key is found at index: "+BinarySearch(Values,key));
        //MinandMax(Values);
        //RevArray(Values);
        PrintPairs(Values);
        }
    }

