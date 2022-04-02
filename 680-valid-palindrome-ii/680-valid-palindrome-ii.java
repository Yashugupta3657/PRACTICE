class Solution {
    public boolean validPalindrome(String s) {
        if(check(s,0,s.length()-1)==true)
            return true;
        else{
            int i=0;
            int j=s.length()-1;
           while(i<j){
               if(s.charAt(i)!=s.charAt(j)){
                   return check(s,i,j-1)||check(s,i+1,j);
               }
               i++;
               j--;
           }
            return true;
        }
    }
    public boolean check(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}