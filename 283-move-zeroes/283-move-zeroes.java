class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int k=0;
         while(i<nums.length){
             while(k<nums.length&&nums[k]==0){
                 k++;
             }
             if(nums[i]==0&&k<nums.length&&k>i){
                 nums[i]=nums[k];
                 nums[k]=0;
             }
             i++;
             k++;
         }
    }
}