package niuke.swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/3
 */
public class PrintLinklist6 {

    public static void main(String[] args) {
        ArrayList<Integer> arraRes = new ArrayList<>();
        Stack<Integer> res = new Stack<>();
        res.isEmpty();
        res.pop();
//        arraRes.

//        res.
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayRes = new ArrayList<>();
        Stack<Integer> res = new Stack<>();
        if(listNode == null){
            return arrayRes;
        }

        res.push(listNode.val);
        while(listNode.next != null){
            listNode = listNode.next;
            res.push(listNode.val);
        }

        while(!res.isEmpty()){
            arrayRes.add(res.pop());
        }
        return arrayRes;

    }
}



class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
