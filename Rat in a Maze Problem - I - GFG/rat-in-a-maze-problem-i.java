// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        boolean visited[][]=new boolean[n][n];
        ArrayList<String> ans=new ArrayList<>();
        solve(m,0,0,"",ans,visited);
        return ans;
    }
    public static void solve(int [][]m,int r,int c,String s,ArrayList<String> ans,boolean visited[][]){
        if(r<0||c<0||r>=m.length||c>=m.length||visited[r][c]||m[r][c]==0){
            return;
        }
        if(r==m.length-1&&c==m.length-1)
        {
            ans.add(s);
            return;
        }
        visited[r][c]=true;
        solve(m,r+1,c,s+"D",ans,visited);
        solve(m,r,c-1,s+"L",ans,visited);
        solve(m,r,c+1,s+"R",ans,visited);
        solve(m,r-1,c,s+"U",ans,visited);
        visited[r][c]=false;
    }    
}