import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> p = new LinkedList<>();
    Queue<Integer> q = new LinkedList<>();
    int size = 0;
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if (q.isEmpty()) {
            q.offer(x);
        } else {
            while (!q.isEmpty()) {
                p.offer(q.poll());
            }
            q.offer(x);
            while (!p.isEmpty()) {
                q.offer(p.poll());
            }
        }
        size++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int element = q.poll();
        size--;
        return element;
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
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
// @lc code=end

