class Solution {
    public boolean canJump(int[] nums) {
        int here=0;
        for(int i=0;i<nums.length;i++){
            if(i>here) return false;
            here=Math.max(here,i+nums[i]);
        }
        return true;
    }
}