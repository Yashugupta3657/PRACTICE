class Solution {
    public String tictactoe(int[][] moves) {
        char arr[][]=new char[3][3];
        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                arr[moves[i][0]][moves[i][1]]='X';
            }
            else{
                arr[moves[i][0]][moves[i][1]]='O';
            }
        }
        return solve(arr,moves.length);
    }
    public String solve(char[][] arr,int n){
        //row wise
        for(int i=0;i<arr.length;i++){
            int ca=0;
            int cb=0;
            for(int j=0;j<3;j++){
                if(arr[i][j]=='X')
                    ca++;
                else if(arr[i][j]=='O')
                    cb++;
            }
            if(ca==3) return "A";
            if(cb==3) return "B";
        }
        //column wise
        for(int i=0;i<arr.length;i++){
            int ca=0;
            int cb=0;
            for(int j=0;j<3;j++){
                if(arr[j][i]=='X')
                    ca++;
                else if(arr[j][i]=='O')
                    cb++;
            }
            if(ca==3) return "A";
            if(cb==3) return "B";
        }
        if(arr[0][0]=='X'&&arr[1][1]=='X'&&arr[2][2]=='X') return "A";
         else if(arr[0][0]=='O'&&arr[1][1]=='O'&&arr[2][2]=='O') return "B";
        else if(arr[0][2]=='X'&&arr[1][1]=='X'&&arr[2][0]=='X') return "A";
        else if(arr[0][2]=='O'&&arr[1][1]=='O'&&arr[2][0]=='O') return "B";
        if(n==9)
            return "Draw";
        return "Pending";
    }
}