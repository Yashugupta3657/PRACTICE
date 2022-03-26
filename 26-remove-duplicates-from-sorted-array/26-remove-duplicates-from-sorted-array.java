class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int currE=1;
        int i=1;
        while(i<nums.length){
             if(nums[i]!=nums[i-1]){
                nums[currE++]=nums[i];
            }
            i++;
        }
        return currE;
    }
}