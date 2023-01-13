// https://leetcode.com/problems/implement-queue-using-stacks
class MyQueue {
    
    // adding new elements to the input stack
    Stack<Integer> input = new Stack<>();
    // when pop/peek is checked, the output stack is empty so input elements will be popped into output
    // that way the order of the elements will be in the form of queue
    Stack<Integer> output = new Stack<>();
    
//     public MyQueue() {
        
//     }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        // the first element is called and popped
        peek();
        return output.pop();
    }
    
    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        // return the first element
        return output.peek();
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
