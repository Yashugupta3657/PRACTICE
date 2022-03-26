class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        
        if(nLen == 0){
            return 0;
        }
        
        int hLen = haystack.length();
        
        if(hLen == 0 || hLen < nLen) {
            return -1;
        }
        
        int limit = hLen - nLen;
        for(int i=0; i<=limit; i++) {
            if(haystack.startsWith(needle, i)) {
                return i;
            }
        }
        
        return -1;
    }
}