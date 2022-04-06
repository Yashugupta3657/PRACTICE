class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long count=0;
        int i=0;
        int MOD = 1000000007;
        Arrays.sort(arr);
        while(i<arr.length){
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                if(arr[i]+arr[low]+arr[high]==target&&arr[low]!=arr[high]){
                    int left=1;
                    int right=1;
                    while(low+1<high&&arr[low]==arr[low+1]){
                        left++;
                        low++;
                    }
                    while(high-1>low&&arr[high]==arr[high-1]){
                        right++;
                        high--;
                    }
                    count+=left*right;
                    count%=MOD;
                    low++;
                    high--;
                }
                else if(arr[i]+arr[low]+arr[high]==target){
                    count+=((high-low+1)*(high-low))/2;
                    count%=MOD;
                    break;
                }
                else if(arr[i]+arr[low]+arr[high]>target){
                    high--;
                }
                else{
                    low++;
                }
            }
                  i++;
        }
        return (int)count;
    }
}