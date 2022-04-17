class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                if(mid-1>=0&&nums[mid-1]==target||mid+1<=high&&nums[mid+1]==target){
                 arr[1]=mid;
                 arr[0]=mid;
                while(mid-1>=0&&nums[mid-1]==target){
                    arr[0]=mid-1;
                    mid--;
                 }
                while(mid+1<=high&&nums[mid+1]==target){
                    arr[1]=mid+1;
                    mid++;    
                 }
                    return arr;
                }
                arr[1]=mid;
                 arr[0]=mid;
                return arr;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}