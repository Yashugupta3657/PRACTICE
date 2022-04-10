class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> maa=new Stack<Integer>();
        for(int i=0;i<ops.length;i++){
           if(ops[i].equals("C")){
                maa.pop();
            }
            else if(ops[i].equals("D")){
                maa.push(maa.peek()*2);
            }else if(ops[i].equals("+")){
                int tk=0,m=0;
                if(!maa.isEmpty())
                tk=maa.pop();
                 if(!maa.isEmpty())
                 m=maa.peek();
                maa.push(tk);
                maa.push(tk+m);
            }
            else{
                maa.push(Integer.valueOf(ops[i]));
            }
        }
        int sum=0;
        while(!maa.isEmpty()){
            sum+=maa.pop();
        }
        return sum;
    }
}