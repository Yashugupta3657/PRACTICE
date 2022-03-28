//2 stacks
class MinStack {
Stack<Integer> value;
    Stack<Integer> minV; 
    public MinStack() {
        value=new Stack<>();
        minV=new Stack<>();
    }
    
    public void push(int val) {
        value.push(val);
        if(minV.isEmpty()){
            minV.push(val);
        }
        else if(minV.peek()>=val){
            minV.push(val);
        }
    }
    
    public void pop() {
        if(value.peek().equals(minV.peek()))
            minV.pop();
        value.pop();
    }
    
    public int top() {
        return value.peek();
    }
    
    public int getMin() {
        return minV.peek();
    }
}
//using pair
// class MinStack {

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
        
//     }
    
//     public void pop() {
        
//     }
    
//     public int top() {
        
//     }
    
//     public int getMin() {
        
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */