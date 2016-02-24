package easy;

import java.util.Stack;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ImplementQueueusingStacks_232 {
	// Push element x to the back of queue.
	Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    public void push(int x) {
        input.push(x);
    }

    public void pop() {
        peek();
        output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}
