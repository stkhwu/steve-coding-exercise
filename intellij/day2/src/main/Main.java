package main;

import classexercise.MyQueue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 6; i++) {
            myQueue.enqueue(i + 1);
        }

        while (!myQueue.empty()) {
            System.out.println(myQueue.dequeue());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i+1);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
