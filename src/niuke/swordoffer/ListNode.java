package niuke.swordoffer;

import java.util.List;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/23
 */
public class ListNode {
    int val;
    public niuke.swordoffer.ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ListNode head = ListNode.buildList(array);
        print(head);
    }

    public static void print(ListNode head) {
        if(head == null) {
            System.out.println("{}");
            return;
        }
        System.out.print(head.val);
        while (head.next != null){
            head = head.next;
            System.out.print(", " + head.val);
        }
        System.out.println();


    }

    public static ListNode buildList(int[] array){
        if (array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode currentNode = head;
        for(int i = 1; i < array.length; ++i) {
            currentNode.next = new ListNode(array[i]);
            currentNode = currentNode.next;
        }
        return head;

    }
}
