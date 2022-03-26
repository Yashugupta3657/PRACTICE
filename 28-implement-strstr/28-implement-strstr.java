class Solution {
    public int strStr(String haystack, String needle) {
           int h=haystack.length();
        int n=needle.length();
        if(n==0) return 0;
        for(int i=0; i<h; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(n>1){
                if(h-i>=n){
                    for(int j=1; j<n; j++){
                        if(haystack.charAt(i+j)!=needle.charAt(j)) break;
                        if(j==n-1) return i;
                    }
                }
                }else{
                    return i;
                }   
          }
        }
        return -1;
    
    }
}