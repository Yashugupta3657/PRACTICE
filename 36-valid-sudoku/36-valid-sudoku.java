class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    if(check(board,i,j)==false)
                        return false;
                }
            }
        }
        return true;
    }
    public boolean check(char[][] board,int row,int col){
        char top=board[row][col];
        for(int i=0;i<board.length;i++){
            if(i!=col&board[row][i]==top){
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if(j!=row&&board[j][col]==top){
                return false;
            }
        }
        //for 3*3
        int ri=row/3 *3;
        int rj=col/3 *3;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i+ri!=row&&j+rj!=col&&board[i+ri][j+rj]==top){
                        return false;
                    }
                }
            }
        return true;
    }
}