//2 stacks
// class MinStack {
// Stack<Integer> value;
//     Stack<Integer> minV; 
//     public MinStack() {
//         value=new Stack<>();
//         minV=new Stack<>();
//     }
    
//     public void push(int val) {
//         value.push(val);
//         if(minV.isEmpty()){
//             minV.push(val);
//         }
//         else if(minV.peek()>=val){
//             minV.push(val);
//         }
//     }
    
//     public void pop() {
//         if(value.peek().equals(minV.peek()))
//             minV.pop();
//         value.pop();
//     }
    
//     public int top() {
//         return value.peek();
//     }
    
//     public int getMin() {
//         return minV.peek();
//     }
// }
//using pair
class MinStack {
   class Pair{
        int val;
        int min;
        public Pair(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
    Stack<Pair> ans;
    public MinStack() {
        ans=new Stack<>();
    }
    
    public void push(int val) {
        if(ans.isEmpty())
            ans.push(new Pair(val,val));
        else if(ans.peek().min<=val){
            ans.push(new Pair(val,ans.peek().min));
        }
        else{
            ans.push(new Pair(val,val));
        }
    }
    
    public void pop() {
        ans.pop();
    }
    
    public int top() {
        return ans.peek().val;
    }
    
    public int getMin() {
        return ans.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */