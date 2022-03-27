class Solution {
    public int singleNumber(int[] nums) {
        //using xor
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum^=nums[i];
        // }
        // return sum;
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(m.contains(nums[i])){
               m.remove(nums[i]);
           }
            else
                m.add(nums[i]);
        }
        for(int t:m)
            return t;
        return 0;
    }
}