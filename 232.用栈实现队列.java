/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    Stack<Integer> p = new Stack<>();
    Stack<Integer> q = new Stack<>();
    int size = 0;
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if (q.isEmpty()) {
            q.push(x);
        } else {
            
            while (!q.isEmpty()) {
                p.push(q.pop());
            }
            
            p.push(x);
            
            while (!p.isEmpty()) {
                q.push(p.pop());
            }
        }
        size++;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        size--;
        return q.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return q.peek();   
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
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
// @lc code=end

