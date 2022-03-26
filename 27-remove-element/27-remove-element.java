class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<=j){
            if(nums[i]==val)
            { 
                count++;
                nums[i]=nums[j];
                nums[j]=val;
                j--;
            }
            else i++;
        }
        return nums.length-count;
        // int size=0,j=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=val)
        //         size++;
        // }   
        // int arr[]=new int[size];
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=val)
        //         arr[j++]=nums[i];
        // }
        // nums=arr;
        // return size;
    }
}