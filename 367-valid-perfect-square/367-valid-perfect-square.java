class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        int j=num/2;
        if(num==1)
            return true;
        while(i<=j){
            long mid=i+(j-i)/2;
            if((mid*mid)==num)
                return true;
            else if((mid*mid)<num){
                i=(int)mid+1;
            }
            else{
                j=(int)mid-1;
            }
        }
        return false;
    }
}

// while(start <= end){
//             long mid = start + (end - start) / 2;
            
//             if(mid * mid == num){
//                 return true;
//             }else if( mid * mid < num){
//                 start = mid + 1;
//             }else{
//                 end = mid -1;
//             }
//         }