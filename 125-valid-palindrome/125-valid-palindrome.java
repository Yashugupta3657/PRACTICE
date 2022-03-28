class Solution {
    public boolean isPalindrome(String s) {
    String result="";
       for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
            result+=s.charAt(i);
        }
    }
        result=result.toLowerCase();
       int i=0;
        int j=result.length()-1;
        while(i<j){
            if(result.charAt(i)==result.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}