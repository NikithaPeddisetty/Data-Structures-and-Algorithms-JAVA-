
public class ArrayIII {
    public static boolean repeated( int arr[]){
        boolean repeat=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return repeat;
                }
            }
        }
        return false;
    }
//calculating maximum profit from buying a stock and selling that stock
    public static void BuyandSell(int prices[]){
        int Buy=prices[0];
        int profit;
        int Sell=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            Buy=Math.min(Buy,prices[i]);
            Sell=Math.max(Sell,prices[i]);
        }
        profit=Sell-Buy;
        System.out.println(profit);
    }
//finding triplets whos sum is 0
    public static void triplets(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        System.out.print("["+nums[i]+","+nums[j]+","+nums[k]+"]"+",");
                    }
                }
            }
        }
    }
//Binary search

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        //boolean repeated_num=repeated(arr);
        //System.out.println(repeated_num);
        //int prices[]={7,2,5,3,6,4};
        //BuyandSell(prices);
        int nums[]={-1,0,1,2,-1,-4};
        triplets(nums);
        
    }
}
