class Solution {
    public int[] minOperations(String boxes) {
        char arr[]=boxes.toCharArray();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]=='1'&&i!=j)
                ans[i]+=Math.abs(i-j);
            }
        }
        return ans;
    }
}