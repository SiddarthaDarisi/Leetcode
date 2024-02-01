class MinStack {
     Stack<Integer> s;
     Stack<Integer> minans;

    public MinStack() {
        s = new Stack<>();
        minans=new Stack<>();
    }
    
    public void push(int val) {
        if(minans.isEmpty()|| val <= minans.peek()){
            minans.push(val);
        }
        s.push(val);
    }
    
    public void pop() {
       if (!s.isEmpty()) {
            if (s.peek().equals(minans.peek())) {
                minans.pop();
            }
            s.pop();
        }
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
      return minans.isEmpty()?0:minans.peek();
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