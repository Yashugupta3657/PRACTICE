class MyStack {
    Queue<Integer> m=new LinkedList<>();
    Queue<Integer> n=new LinkedList<>();
    public MyStack() {
            
    }
    
    public void push(int x) {
        while(!m.isEmpty()){
            n.add(m.remove());
        }
        m.add(x);
        while(!n.isEmpty())
            m.add(n.remove());
    }
    
    public int pop() {
              if(!m.isEmpty())
       return m.remove();
        return 0;
    }
    
    public int top() {
              if(!m.isEmpty())
        return m.peek();
        return 0;
    }
    
    public boolean empty() {
        if(m.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */