package mock.minstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {


    Stack<Integer> stack;

    int min = Integer.MAX_VALUE;

    List<Integer> minList;

    public MinStack() {
        stack = new Stack<>();
        minList = new ArrayList<>();
    }

    public int push(int val) {
        if (val < min){
            min = val;
        }
        return stack.push(val);
    }

    public void pop() {
        if(stack.pop() == min){

        }
    }

    public int top(){
        int temp;
        temp = stack.pop();
        push(temp);
        return temp;
    }

    public int getMin() {
        return min;
    }
}
