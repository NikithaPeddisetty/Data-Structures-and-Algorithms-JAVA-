public class BackTracking {
 //create an array and change the values in array using backtrackting
    //time com/eplexity-O(n) and space com-O(n)
    public static void PrintSubsets(String str,int i,String ans){
        //basecase
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }
        //backtracking using recursion
        //choice yes
        PrintSubsets(str, i+1,ans+str.charAt(i));
        //choice no
        PrintSubsets(str, i+1, ans);
    }
//find permutations(no. of ways a string can be rearranged)
    //t.complexity--O(n *n!)
    public static void FindPermutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //backtracking
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            FindPermutations(newStr, ans+curr);
        }
    }
//grid ways--Find no. of ways to reach from (0,0) to (n-1,m-1) in a nxm 2d matrix (grid)...allowed moves right and down
    //time complexity--O(2^n+m)
    public static int gridWays(int row,int col,int n,int m){
        //base case
        if(row==n-1 && col==m-1){
            return 1;
        }else if(row ==n || col==m){
            return 0;
        }
        //backtracking
        //right 
        int w1=gridWays(row,col+1,n,m);
        //down
        int w2=gridWays(row+1, col, n, m);
        int totalways=w1+w2;
       
        return totalways;
    }
    public static void main(String args[]){
        // String str="abc";
        // // PrintSubsets(str,0,"");
        // FindPermutations(str, "" );
       // int grid[][]=new int[3][3];
        int n=3;
        int m=3;
        System.out.println(gridWays(0, 0, n, m));

    }
}
