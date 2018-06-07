package niuke.swordoffer;

import org.w3c.dom.NodeList;

import java.util.List;
import java.util.Stack;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/7
 */
public class ReverseLinkList {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr = {1};
        ListNode head = ListNode.buildList(arr);

        ListNode.print(head);
        ListNode tail = reverseLinkList(head);
        ListNode.print(tail);
    }



    public static ListNode reverseLinkList(ListNode head) {
        Stack<ListNode> nodeStack = new Stack<>();
        ListNode current = null;
        if(head == null) {
            return null;
        }
        if(head.next != null) {
            nodeStack.push(head);
            current = head;
        }else {
            return head;
        }
        while (current.next != null){
            nodeStack.push(current.next);
            current = current.next;
        }
//        System.out.println(nodeStack.size());

        ListNode tail = null;
        ListNode last = null;

        if(!nodeStack.isEmpty()) {
            tail = nodeStack.pop();
        } else {
            return null;
        }
        current = tail;

        while (!nodeStack.isEmpty()) {
            current.next= nodeStack.pop();
            current = current.next;
        }
        current.next = null;
        return tail;
    }

}
