package com.algorithm.askar.stack;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack;
    int MAX = 0;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (empty()) {
            MAX = x;
            stack.push(x);
        } else {
            stack.push(x);
        }
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int tempNumber = MAX;
        Stack<Integer> temp = new Stack<>();
        while (!empty()) {
            temp.push(stack.pop());
        }
        temp.pop();
        if (!temp.isEmpty()) {
            MAX = temp.peek();

        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return tempNumber;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return MAX;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
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