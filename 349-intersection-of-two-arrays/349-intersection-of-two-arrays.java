class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<Integer>();
        HashSet<Integer> ans=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
            map.add(nums1[i]);
        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int arr[]=new int[ans.size()];
        int i=0;
        for(Integer m:ans){
            arr[i++]=m;
        }
    return arr;
    }
}