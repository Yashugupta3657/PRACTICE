class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int total[]=new int[mat.length];
       for(int i=0;i<mat.length;i++){
           int count=totalFind(mat[i]);
           total[i]=count;
       }
        int an[]=new int[k];
        for(int m=0;m<k;m++){
            int min=0;
            for(int n=0;n<total.length;n++){
                if(total[n]<total[min]){
                    min=n;
                }
            }
            an[m]=min;
            total[min]=Integer.MAX_VALUE;
        }
        return an;
    }
    public int totalFind(int[] m){
        int i=0;
        int j=m.length;
        while(i<j){
            int mid=i+(j-i)/2;
            if(m[mid]==1)
                i=mid+1;
            else
                j=mid;
        }
        return i;
    }
}