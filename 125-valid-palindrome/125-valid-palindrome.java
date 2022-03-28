class Solution {
    public boolean isPalindrome(String s) {
    String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>='0'&&s.charAt(i)<='9')
                result+=s.charAt(i);
        }
        result=result.toLowerCase();
        System.out.print(result);
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