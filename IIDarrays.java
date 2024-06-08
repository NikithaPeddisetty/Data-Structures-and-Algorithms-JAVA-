import java.util.*;
public class IIDarrays{

   //finding the largest and smallest number
   public static void LargAndSmall(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]>largest){
                largest=matrix[i][j];
            }
            if(matrix[i][j]<smallest){
               smallest= matrix[i][j];
            }
        }
    }
    System.out.println("the largest element in the matrix is "+largest+"and the smallest element is "+smallest);
   }
   
   /*diagonal sum ---O(n)
    * diagonal sum of a matrix = primary diagonal + secondary diagonal
    */
    public static void diagonalSum(int matrix[][]){
        int diag_sum=0;
        for (int i=0;i<matrix.length;i++){
            //primary_diagonal
            diag_sum+=matrix[i][i];
            //secondary_diagonal
            if(i != matrix.length-1-i){
            diag_sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(diag_sum);
    }

    // staircase search---searching in sorted matrix--O(n+m)
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=matrix.length-1;
        int col=0;
        while(col<row && row>=0){
            if(key==matrix[row][col]){
                System.out.println("key is found at index ("+row+","+col+")");
                return true;
            }
            if(key>matrix[row][col]){
                //travel right
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        int key=9;
        //creating a matrix
        Scanner sc = new Scanner(System.in); 
        for (int i=0;i<n;i++){          //input
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        //output
        for (int i=0;i<n;i++){        
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        staircaseSearch(matrix,key);
    }
}