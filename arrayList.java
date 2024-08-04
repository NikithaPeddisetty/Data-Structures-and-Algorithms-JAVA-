import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
//swap 2 elements
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        
    }
//container with most water time--O(n)
//2 pointer uproach
    public static int MostWater(ArrayList<Integer> container){
        int maxWater=0;
        int lp=0;//left pointer
        int rp=container.size()-1;//right pointer
        while(lp<rp){
            int height=Math.min(container.get(lp),container.get(rp));
            int width=rp-lp;
            int curr_water=height*width;
            maxWater=Math.max(maxWater,curr_water);
            if(container.get(lp)<container.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
//pair sum time for sorted array time--O(n)
//2 pointer approach
    public static boolean PairSum(ArrayList<Integer> sorted_arr,int target){
        int lp=0;
        int rp=sorted_arr.size()-1;
        while(lp<rp){
            if(sorted_arr.get(lp)+sorted_arr.get(rp)==target){
                return true;
            }
            if(sorted_arr.get(lp)+sorted_arr.get(rp)>target){
                rp--;
            }else{
                lp--;
            }
            
        }
        return false;
    }
//pair sum 2-check if sum of 2 nums in sorted pivoted array == target
//2 pointer uproach--timeO(n)
    public static boolean PairSum2(ArrayList<Integer> sorted_arr,int target){
        int bp=-1;
        int n= sorted_arr.size();
        //finding breaking point
        for(int i=0;i<sorted_arr.size();i++){
            if(sorted_arr.get(i)>sorted_arr.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=bp){
            //case1:
            if(sorted_arr.get(lp)+sorted_arr.get(rp) ==target ){
                return true;
            }
            //case2:
            if(sorted_arr.get(lp)+sorted_arr.get(rp) >target ){
                rp =(n+rp-1)%n;
             }
             //case3:
            if(sorted_arr.get(lp)+sorted_arr.get(rp) <target ){
                lp=(lp+1)%n;
             }

        }
        return false;
    }
    // public static void frequentlyOccured(ArrayList<Integer> A,ArrayList<Integer> target,int key){
    //     for(int i=0;i<A.size();i++){
    //         if(A.get(i)==key){
    //             target.add(A.get(i+1));
    //         }
    //     }
    //     int max_count=0;
    //     int freq=0;
    //     for(int i=0;i<target.size();i++){
    //         int count =0;
    //         for(int j=0;j<target.size();j++){
    //             if(target.get(i)==target.get(j)){
    //                 count++;
    //             }
    //         }
    //         if(count>max_count){
    //             max_count=count;
    //             freq=target.get(i);
    //         }

    //     }
    //     System.out.println(freq);
    // }
    public static int MostFrequent(ArrayList<Integer> A,int key){
        int result[]=new int[1001];
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)==key){
                result[A.get(i+1)]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=1;i<result.length;i++){
            if(result[i]>max){
                max=result[i];
                ans=i;
            }
        }
        return ans;
    }
    public static void Lonely(ArrayList<Integer> A){
        ArrayList<Integer> alone= new ArrayList<>();
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                if(A.get(i)!=A.get(j) && A.get(j)!=A.get(i)+1 && A.get(j)!=A.get(i)-1 ){
                    alone.add(A.get(i));
                }
            }
        }
       
    }
    public static void main(String args[]){
         ArrayList <Integer> list = new ArrayList<>();
         list.add(34);//time--(O(1))
         list.add(34);
         list.add(35);
         list.add(45);
        list.add(299);
    //   // int idx1=1;int idx2=3;
        System.out.println(list);
    //    swap(list,idx1,idx2);
    //    System.out.println(list);
    //    Collections.sort(list);//ascending order
    //    System.out.println(list);
    //    //descending order
    //    Collections.sort(list,Collections.reverseOrder());
    //    System.out.println(list);
/* multidimensional array
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer>list2 = new ArrayList<>();
    ArrayList<Integer>list3 = new ArrayList<>();
    
    for (int i=1;i<5;i++){
        list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);

    
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<list1.size();j++){
                System.out.println(currList.get(j));
            }
            System.out.println("");
        }*/
        // ArrayList<Integer> container = new ArrayList<>();
        // container.add(1);
        // container.add(8);
        // container.add(6);
        // container.add(2);
        // container.add(5);
        // container.add(4);
        // container.add(8);
        // container.add(3);
        // container.add(7);

        // System.out.println(MostWater(container));
        // ArrayList<Integer> sorted_arr = new ArrayList<>();
        // sorted_arr.add(1);
        // sorted_arr.add(2);
        // sorted_arr.add(3);
        // sorted_arr.add(4);
        // sorted_arr.add(5);
        // sorted_arr.add(6);
        // int target =5;
        // System.out.println(PairSum(sorted_arr, target));
        // ArrayList<Integer> sorted_arr = new ArrayList<>();
        // sorted_arr.add(11);
        // sorted_arr.add(15);
        // sorted_arr.add(6);
        // sorted_arr.add(7);
        // sorted_arr.add(8);
        // sorted_arr.add(9);
        // int target =15;
        // PairSum2(sorted_arr, target);
        // System.out.println(PairSum2(sorted_arr, target));
        // ArrayList<Integer> A = new ArrayList<>(999);
        // A.add(2);
        // A.add(2);
        // A.add(2);
        // A.add(2);
        // A.add(3);
        
        // int key = 2;
        // System.out.println(MostFrequent(A, key));
        ArrayList<Integer> A= new ArrayList<>();
        A.add(10);
        A.add(6);
        A.add(5);
        A.add(8);
        A.add(8);
        A.add(3);
        Lonely(A);






    }
}
