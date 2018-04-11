package nukeTest;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Test5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int i=1;
        while(i<stack1.size())
            stack2.push(stack1.pop());
            i++;
        i = 1;
        int item = stack1.pop();
        while(i<=stack2.size())
            stack1.push(stack2.pop());
            i++;

        return item;
    }
}
