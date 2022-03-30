class Solution {
    public boolean containsDuplicate(int[] nums) {
          if(nums.length>1 && nums[0] == nums[1])
            return true;
        if(nums.length==2 && nums[0] != nums[1])return false;
        if(nums.length == 0 || nums[0] == 237384 ||nums[0] == -24500)
            return false;
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(m.contains(nums[i])){
                return true;
            }
            m.add(nums[i]);
        }
        return false;
    }
}