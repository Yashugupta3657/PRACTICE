class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>(nums.length); 
        for(int i=0;i<nums.length;i++){
              if(m.containsKey(nums[i])&&i-m.get(nums[i])<=k){
                  return true;
              }
            m.put(nums[i],i);
        }
        return false;
    }
}