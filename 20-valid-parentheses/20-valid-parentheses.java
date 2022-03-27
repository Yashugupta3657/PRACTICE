class Solution {
    public boolean isValid(String s) {
        Stack<Character> m=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                m.push(s.charAt(i));
            }
            else if(!m.isEmpty()){
                if(m.peek()=='('||m.peek()=='['||m.peek()=='{'){
                    if(s.charAt(i)==')'&&m.peek()=='('){
                        m.pop();
                    }
                      else  if(s.charAt(i)==']'&&m.peek()=='['){
                        m.pop();
                    }
                      else  if(s.charAt(i)=='}'&&m.peek()=='{'){
                        m.pop();
                    }
                    else return false;
                }
                else{
                    return false;
                }
            }
            else return false;
        }
        if(m.isEmpty())
            return true;
        else return false;
    }
}