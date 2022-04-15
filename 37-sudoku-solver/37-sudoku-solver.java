class Solution {
            char [][]board1=new char[9][9];
    public void solveSudoku(char[][] board) {
        checker(board,0,0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
              board[i][j]=board1[i][j];
            }
        }
        
    }
    public boolean isValid(char[][] board,int row,int col,char val){
        for(int i=0;i<9;i++){
            if(board[i][col]==val)
                return false;
        }
        for(int j=0;j<9;j++){
            if(board[row][j]==val)
                return false;
        }
        //for 3x3 checking
        int rowB=(row / 3) * 3;
        int colB=(col / 3) * 3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+rowB][j+colB]==val)
                    return false;
            }
        }
        return true;
    }
    public boolean checker(char[][] board,int i,int j){
        if(i==board.length){
            for(int k=0;k<9;k++){
                for(int l=0;l<9;l++){
                          // System.out.print(board[k][l]); 
                    board1[k][l]=board[k][l];
                }
                // System.out.println();
            }
            // board1=board.clone();
            return true;
        }
       int nr=0;
        int nc=0;
        if(j==board.length-1){
            nr=i+1;
            nc=0;
        }else{
            nc=j+1;
            nr=i;
        }
        if(board[i][j]!='.'){
            checker(board,nr,nc);
        }
       else{
            for(char p='1';p<='9';p++){
                if(isValid(board,i,j,p)){
                    board[i][j]=p;
                    if(checker(board,nr,nc))
                        return true;
                    board[i][j]='.';
                }
            }
       }
         return false;
    }
}