class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int k=-1;
        for(int m=0;m<row;m++){
            if(matrix[m][0]<=target&&target<=matrix[m][col-1]){
                k=m;
                break;
            }
        }
        if(k==-1)
            return false;
        int i=0;
        int j=col-1;
        while(i<=j){
           int mid=(i+j)/2;
            if(matrix[k][mid]==target){
                return true;
            }
            else if(matrix[k][mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
}