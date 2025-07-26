import java.util.*;
class MyQueue {
      Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public MyQueue() {
      
    }
    
    public void push(int x) {
         while(!st.empty()){
             st2.push(st.peek());
             st.pop();
         }
         st.push(x);
         while (!st2.empty()){
             st.push(st2.peek());
             st2.pop();
    }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.empty();
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