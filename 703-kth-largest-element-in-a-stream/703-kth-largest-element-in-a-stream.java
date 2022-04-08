class KthLargest {
    PriorityQueue<Integer> map=new PriorityQueue<>();
    int k=0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++)
            map.add(nums[i]);
        while(map.size()>k)
            map.poll();
    }
    
    public int add(int val) {
        map.add(val);
        if(map.size()>k)
            map.poll();
        return map.peek();
    }
}

//class KthLargest {
//     PriorityQueue<Integer> map=new PriorityQueue<>(Collections.reverseOrder());
//     int index=0;
//     int arr[];
//     public KthLargest(int k, int[] nums) {
//         index=k;
//         arr=new int[k];
//         for(int i=0;i<nums.length;i++)
//             map.add(nums[i]);
//     }
//     public int add(int val) {
//         map.add(val);
//         for(int i=0;i<index-1;i++)
//             arr[i]=map.poll();
//         int ans=map.peek();
//         for(int i=0;i<index-1;i++)
//             map.add(arr[i]);
//         return ans;
//     }
// }

 /*
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */