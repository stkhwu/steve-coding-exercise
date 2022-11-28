package classexercise;

import java.util.Stack;

// implement Queue with Stack
public class MyQueue {
    // private LinkedList list
    private final Stack<Integer> stack = new Stack<>();

    public void enqueue(int item) {
        stack.push(item);
    }

    public int dequeue() {
        if (stack.empty()) {
            return 0;
        }
        Stack<Integer> temp = new Stack<>();

        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        int obj = temp.pop();
        while (!temp.empty()) {
            stack.push(temp.pop());
        }

        return obj;
    }

    public boolean empty() {
        return stack.empty();
    }
}
