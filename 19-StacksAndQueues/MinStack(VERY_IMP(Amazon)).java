// https://leetcode.com/problems/min-stack
// Use 2 stacks to track the min and just add elements to the normal stack
// and no big difference in runtime
class MinStack {
    // Using two stacks
  // O(1) in getMin
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

//     public MinStack() {
        
//     }
    
    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

// Using one stack
class MinStack {
    
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

//     public MinStack() {
        
//     }
    
    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
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
