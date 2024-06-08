public class ArraysII {
 //O(n^3) (bruit force)print subarrays (sub arrays=a continuous part of array),and find the sum of subarrays and print the highest of all sums
    public static void SubArray(int numbers[]){
        int MaxSum=Integer.MIN_VALUE;
        int ts =0;//ts=total num of subarrays
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");//subarray
                    
                    sum=sum+numbers[k];
                    
                }
                System.out.println("the sum is:"+sum);
                if(sum>MaxSum){
                    MaxSum=sum;
                }
                System.out.println();
                ts++;
            }
            
        }
        System.out.println("the maximum of all the sums of sub arrays is: "+MaxSum);
        System.out.println("the total number of SubArrays are:" + ts);
}  
//O(n^2)optimized method to solve above prblm...i.e;prefix sum method
    public static void PrefixSum(int numbers[]){
        int sum=0;
        int Max_Sum=Integer.MIN_VALUE;
        int Prefix_Sum[]=new int[numbers.length];
        Prefix_Sum[0]=numbers[0];//initializing prefix array
        //creating sum values in prefix array
        for(int i=1;i<Prefix_Sum.length;i++){
            Prefix_Sum[i]=Prefix_Sum[i-1] + numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(i==0){
                    sum=Prefix_Sum[j];
                }
                else{
                    sum=Prefix_Sum[j]-Prefix_Sum[i-1];
                }
                
            }
            if(sum>Max_Sum){
                Max_Sum=sum;
            }
            
        }
        System.out.println("The Highest of all sums is: "+Max_Sum);
    }
//Kadane's algorithm O(n)
    public static int Kadanes(int numbers[]){
        int CurSum=0;
        int Max_Sum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                if(numbers[i]>Max_Sum){
                    Max_Sum=numbers[i];
                }
            }
        }
        System.out.println("the maximum value from all sum is: "+Max_Sum);
        for(int i=0;i<numbers.length;i++){
            Max_Sum=Integer.MIN_VALUE;
            CurSum=CurSum+numbers[i];
            if(CurSum<0){
                CurSum=0;
            }
            Max_Sum=Math.max(CurSum,Max_Sum);
        }
        System.out.println("the maximum value from all sum is: "+Max_Sum);
    }
        

    public static void main(String args[]){
        int numbers[]={-2,-4,-3,-1,-7};
        //SubArray(numbers);
        //PrefixSum(numbers);
        Kadanes(numbers);
    }
}
