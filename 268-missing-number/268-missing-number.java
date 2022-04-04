class Solution {
    public int missingNumber(int[] nums) {
        //using simple maths formula
        int sum=(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++)
            sum-=nums[i];
        return sum;
    }
}
// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int arr[]=new int[nums[nums.length-1]+1];
//         for(int i=0;i<nums.length;i++){
//             arr[nums[i]]++;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==0)
//                 return i;
//         }
//         return nums[nums.length-1]+1;
//     }
// }