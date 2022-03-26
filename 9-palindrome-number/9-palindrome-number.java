class Solution {
    public boolean isPalindrome(int x) {
        int back=0;
        int front=x;
        while(x>0){
            int a=x%10;
            back=back*10+a;
            x=x/10;
        }
        if(front==back)
            return true;
        return false;
    }
   
}