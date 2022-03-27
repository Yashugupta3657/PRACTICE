class Solution {
    public int mySqrt(int x) {
        int i=0,j=x,ans=-1;
        while(i<=j){
            long  mid=(i+j)/2;
            long  check=mid*mid;
            if(check==x){
                return (int)mid;
            }
            else if(check<x){
                i=(int)mid+1;
                ans=(int)mid;   
            }
            else{
                j=(int)mid-1;
            }
        }
        return ans;
    }
}