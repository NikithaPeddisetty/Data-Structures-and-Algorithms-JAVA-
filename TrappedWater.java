
public class TrappedWater {
    public static void trappedwater(int height[]){
        int n=height.length;
        int waterlevel;
        int trappedwater=0;

        //calculate maximum left boundary
        int left_max[]= new int[height.length];
        left_max[0]=height[0];//initializing left max array
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        //calculate maximum right boundary
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];//we r gng to start from the end
        for(int i=n-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        //calculate waterlevel
        for(int i=0;i<n;i++){
            //calculate water level
            waterlevel=Math.min(left_max[i],right_max[i]);
            //trapped water
            trappedwater+=waterlevel-height[i];
            
        }
        System.out.println("the total water trapped is: "+trappedwater);
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);
        
    }
}
