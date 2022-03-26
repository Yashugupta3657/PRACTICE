class Solution {
    public int strStr(String haystack, String needle) {
         int m = haystack.length();
        int n = needle.length();
        for (int i = 0; (i + n) <= m; i++) {
            int j = i + n;
            if (haystack.substring(i,j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}