class Solution {
    public int findDuplicate(int[] nums) {
       int dupl=-1;
        for(int i=0;i<nums.length;i++){
            int curr=Math.abs(nums[i]);
            if(nums[curr]<0){
            dupl=curr;
                break;
            }
            nums[curr]*=-1;
        }
        return dupl;
    }
}