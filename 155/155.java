class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> s;
    private Stack<Integer> min;
    public MinStack() {
        s = new Stack();
        min = new Stack();
    }
    
    public void push(int x) {
        s.push(x);
        if (min.isEmpty()){
            min.push(x);
        }
        else{
            if (x<min.peek()){
                min.push(x);
            }
            else{
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */