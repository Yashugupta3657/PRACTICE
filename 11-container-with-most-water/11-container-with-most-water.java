class Solution {
    public int maxArea(int[] height) {
        int max=area(0,height.length-1,height);
        int i=0;
        int j=height.length-1;
        while(i<j){
            // if(height[i]<=height[j])
            //     i++;
            // else{
            //     j--;
            // }
                  int hLeft = height[i];
            int hRight = height[j];
              if (height[i] < height[j]) {
                while (i < j && height[i] <= hLeft) {
                    i++;                    
                }
            } else {
                while (i < j && height[j] <= hRight) {
                    j--;                    
                }
            }
            max=Math.max(max,area(i,j,height));
        }
        return max;
    }
    public int area(int i,int j,int[] height){
            int max=Math.min(height[i], height[j])*(j-i);
        return max;
    }
}