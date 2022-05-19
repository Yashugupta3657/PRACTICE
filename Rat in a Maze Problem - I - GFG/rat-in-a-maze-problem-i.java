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
        boolean visited[][]=new boolean[n][n];
        ArrayList<String> sol=new ArrayList<>();

        solve(m,0,0,"",visited,sol);
        return sol;
    }
    public static void solve(int arr[][],int r,int c,String s,boolean visited[][],ArrayList<String> sol){

        if(r<0||r==arr.length||c<0||c==arr.length||arr[r][c]==0||visited[r][c]){
            return;
        }
        else if(r==arr.length-1&&c==arr.length-1){
            if(arr[r][c]==1)
            sol.add(s);
            return;
        }
        visited[r][c]=true;
        solve(arr,r+1,c,s+"D",visited,sol); //down;//left//right//up
        solve(arr,r,c-1,s+"L",visited,sol);
        solve(arr,r,c+1,s+"R",visited,sol);
        solve(arr,r-1,c,s+"U",visited,sol);
        visited[r][c]=false;
    }
}