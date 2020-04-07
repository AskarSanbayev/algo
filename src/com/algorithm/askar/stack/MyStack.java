package com.algorithm.askar.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    int MAX = 0;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        MAX = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int newTop = -1;
        while (queue.peek() != MAX) {
            newTop = queue.peek();
            queue.add(queue.poll());
        }
        MAX = newTop;
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return MAX;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
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
