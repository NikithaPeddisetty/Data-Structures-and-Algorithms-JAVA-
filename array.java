import java.util.*;
public class array {

    //largest element

    public static void Largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
            
        }
        System.out.println("the largest element is "+largest);
    }

    //spiral matrix 

    public static void printSpiral(int matrix[][]){
        int startRow=0,startCol=0,endRow=matrix.length-1,endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for( int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                  break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
               // if(startCol==endCol){
                 //   break;
                //}
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
    }

    //diagonal sum

    public static void DiagonalSum(int matrix[][]){
       //(O(n^2)--brute method



       //optimized way
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal sum
            sum+=matrix[i][i];
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }

    //counting a key 
    public static void searchandcount(int matrix[][],int key){
        int count =0;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(key==matrix[i][j]){
                    count+=1;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String args[]){
        int matrix[][]=new int[2][2];
        int n=matrix.length,m=matrix[0].length;
        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){   //setting the range of input values
            for(int j=0;j<m;j++){
                 matrix[i][j]=sc.nextInt();
            }
        }
        int key = sc.nextInt();
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.print(key);
        //Largest(matrix);
        //printSpiral(matrix);
        //DiagonalSum(matrix);
        searchandcount(matrix,key);
    }
}
