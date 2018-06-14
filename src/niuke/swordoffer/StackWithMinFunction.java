package niuke.swordoffer;

import java.util.Stack;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/14
 */
public class StackWithMinFunction {
    public static void main(String[] args) {
        StackWithMinFunction stackWithMinFunction = new StackWithMinFunction();
        stackWithMinFunction.push(3);
        stackWithMinFunction.min();
        stackWithMinFunction.push(4);
        stackWithMinFunction.min();
        stackWithMinFunction.push(2);
        stackWithMinFunction.min();
        stackWithMinFunction.push(3);
        stackWithMinFunction.min();
        stackWithMinFunction.pop();
        stackWithMinFunction.min();
        stackWithMinFunction.pop();
        stackWithMinFunction.min();
        stackWithMinFunction.pop();
        stackWithMinFunction.min();
        stackWithMinFunction.push(0);
        stackWithMinFunction.min();
    }


    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node){
        mainStack.push(node);
        if(minStack.isEmpty()){
            minStack.push(node);
            return;
        }
        if(node < minStack.lastElement()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.lastElement());
        }
    }
    public void pop(){
        minStack.pop();
        mainStack.pop();
    }
    public int top(){
        return mainStack.lastElement();
    }
    public int min(){
        return minStack.lastElement();
    }
}
