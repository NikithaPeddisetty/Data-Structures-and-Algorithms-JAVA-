public class nQueens {
    //nq fnc(
    public static void NQueens(char Board[][],int row){
        //basecase
        if(row==Board.length){
            PrintBoard(Board);
            return;
        }
        //backtracking using recursion
        for(int col=0;col<Board.length;col++){
            if(isSafe(Board, col, row)){
            Board[row][col]='Q';
            NQueens(Board, row+1);
            Board[row][col]='X';
            }
        }
    }
    
    //print board fnc
    public static void PrintBoard(char Board[][]){
        System.out.println("------chess Board-----");
        for(int row=0;row<Board.length;row++){
            for(int col=0;col<Board.length;col++){
                System.out.print(Board[row][col]+ " ");
            }
            System.out.println("");
        }
    }
    //issafe fnc
    public static boolean isSafe(char Board[][],int col,int row){
        //up
        for(int i=row-1;i>=0;i--){
            if(Board[i][col]=='Q'){
                return false;
            }
        }
        //diag up left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        //diag up right
        for(int i=row-1,j=col+1;i>=0 && j<Board.length;i--,j++){
            if(Board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        
        int n=4;
        //create board
        char Board[][]=new char[n][n];
        
        for(int row=0;row<n;row++){
            for (int col=0;col<n;col++){
                Board[row][col]='X';
            }
        }
        NQueens(Board, 0);
    }
    
}
