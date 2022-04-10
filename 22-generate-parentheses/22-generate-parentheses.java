class Solution {
    List<String> list=new ArrayList<String>();
    public List<String> generateParenthesis(int n){
        if(n==1)
        {
            list.add("()");
            return list;
        }
        find(new StringBuilder(),n,0);
        return list;
    }
    public void find(StringBuilder sb,int n,int ind){
        if(ind==2*n){
            if(valid(sb.toString()))
            { list.add(sb.toString());}
            return;
        }
            else{
                sb.append("(");
                find(sb,n,ind+1);
                sb.deleteCharAt(sb.length() - 1);
                sb.append(")");
                find(sb,n,ind+1);
                sb.deleteCharAt(sb.length() - 1);
            }
    }
     public boolean valid(String currenty) {
        int balance = 0;
         char current[]=currenty.toCharArray();
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}