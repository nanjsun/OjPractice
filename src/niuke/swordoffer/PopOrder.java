package niuke.swordoffer;

import java.util.Stack;

/**
 * test
 *
 * build a stack,
 * search popA, if popA element is same as the top element of stack, and remove this popA element and from stack;
 * if the element is not same as stack, search pushA, and push different element to this stack.
 * when popA search index reach the tail , return true , or pushA index research tail return false.
 *
 * @author nanj
 * @date 2018/6/18
 */
public class PopOrder {

    public static void main(String[] args) {
        PopOrder popOrder = new PopOrder();

        int[] pushA = {1,2,3,4,5};
//        int[] popA = {3,5,4,2,1};
        int[] popA = {4,3,5,1,2};

        boolean res = popOrder.IsPopOrder(pushA, popA);
        System.out.println(res);
    }

    public boolean IsPopOrder(int[] pushA, int[] popA) {

        int pushIndex = 0;
        int popIndex = 0;
        Stack<Integer> stack = new Stack<>();

        while (popIndex < popA.length) {
            if(!stack.isEmpty() && (popA[popIndex] == stack.lastElement())) {
                stack.pop();
                popIndex ++;
                if(popIndex >= popA.length) {
                    return true;
                }
            } else {
                if(pushIndex >= pushA.length) {
                    return false;
                }
                while (popA[popIndex] != pushA[pushIndex]) {
                    stack.push(pushA[pushIndex]);
                    pushIndex ++;
                    if(pushIndex >= pushA.length) {
                        return false;
                    }

                }
                popIndex ++;
                pushIndex ++ ;
            }
        }
        return true;
    }
}
