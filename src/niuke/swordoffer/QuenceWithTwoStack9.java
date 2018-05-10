package niuke.swordoffer;

import java.util.Stack;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/10
 *
 * implement a quence with two stack.
 *
 */
public class QuenceWithTwoStack9 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.empty()){
            stack1.add(stack2.pop());
        }
        stack1.push(node);

    }

    public int pop() {
        while (!stack1.empty()){
            stack2.add(stack1.pop());
        }
        int res = stack2.pop();

//        while (!stack2.empty()){
//            stack1.add(stack2.pop());
//        }
        return res;
    }
}
