class MyStack {
    
    private Queue<Integer> realQueue;
    private Queue<Integer> tempQueue;

    /** Initialize your data structure here. */
    public MyStack() {  
        realQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        int realLen = realQueue.size();
        if(realLen == 0) {
            realQueue.offer(x);
        } else {
            tempQueue.offer(x);
            while(!realQueue.isEmpty()) {
                int temp = realQueue.poll();
                tempQueue.offer(temp);
            }
            
            while(!tempQueue.isEmpty()) {
                int temp = tempQueue.poll();
                realQueue.offer(temp);
            }
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return realQueue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return realQueue.element();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return realQueue.isEmpty();
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