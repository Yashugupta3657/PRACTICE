class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder resulty=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
           resulty.append(s.charAt(i));
        }
    }
        String result="";
        result=resulty.toString();
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