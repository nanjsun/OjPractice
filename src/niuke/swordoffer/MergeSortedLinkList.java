package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/6/8
 */
public class MergeSortedLinkList {
    public static void main(String[] args) {
        int[] arrA = {0, 2,2,2, 4, 6, 8};
        int[] arrB = {1, 3, 5, 7, 9};

        ListNode headA = ListNode.buildList(arrA);
        ListNode headB = ListNode.buildList(arrB);

        ListNode.print(headA);
        ListNode.print(headB);

        ListNode mergedLinkList = mergeSortedLinkList(headA, headB);

        ListNode.print(mergedLinkList);


    }


    public static ListNode mergeSortedLinkList(ListNode headA, ListNode headB) {
        ListNode mergedHead = null;
        if(headA == null){
            return headB;
        }

        if(headB == null){
            return headA;
        }

        if(headA.val <= headB.val) {
            mergedHead = headA;
            headA = headA.next;
        } else {
            mergedHead = headB;
            headB = headB.next;
        }
        ListNode current = mergedHead;

        while (true){
            if(headA == null) {
                current.next = headB;
                current = current.next;
                break;
            }
            if(headB == null) {
                current.next = headA;
                current = current.next;
                break;
            }
            if(headA.val <= headB.val) {
                current.next = headA;
                current = current.next;
                headA = headA.next;
            } else {
                current.next = headB;
                current = current.next;
                headB = headB.next;
            }

        }
        current.next = null;
        return mergedHead;
    }
}
