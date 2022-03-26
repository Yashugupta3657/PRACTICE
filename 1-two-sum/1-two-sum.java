class Solution {
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(m.containsValue(target-nums[i])){
                    arr[0]=getKey(m,target-nums[i]);
                    arr[1]=i;
                return arr;
            }
            m.put(i,nums[i]);
        }
        return arr;
    }
}