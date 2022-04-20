class Solution {
       List<List<String>> solution=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        
        String arr[][]=new String[n][n];
        for(String[] m:arr){
            Arrays.fill(m,".");
        }
        solve(arr,0,0,0);
        return solution;
    }
    public void solve(String[][] arr,int row,int col,int count){
        if(row==arr.length){ 
            List<String> make=new ArrayList<>();
                          
            for(int i=0;i<arr.length;i++){
                 String str="";
                for(int j=0;j<arr.length;j++)
                {
                    str+=arr[i][j];
                }
                make.add(str);   
            }
                solution.add(make);
            return;
        }
        for(int j=0;j<arr.length;j++){
            if(check(arr,row,j)){
                arr[row][j]="Q";
                solve(arr,row+1,j,count+1) ;
                arr[row][j]=".";
            }
        }
    }
    public boolean check(String[][] arr,int row,int col){
        for(int j=0;j<arr.length;j++){
            if(arr[row][j]=="Q")
                return false;
        }
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i][col]=="Q") return false;
        }

        for (int i = row - 1, j = col + 1; 
                i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == "Q")
                return false;
        }

        for (int i = row - 1, j = col - 1;
                i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == "Q")
                return false;
        } 
        return true;
    }
}