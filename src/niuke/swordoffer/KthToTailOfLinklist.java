package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/5/23
 *
 * 解题思路： 设置两个指针，currentNode 和 kThNode ：
 * 1、两个都指向头指针；
 * 2、currentNode向后移动，直到和kThNode相差 k-1；
 * 3、同时将currentNode 和 kThNode 向后滑动，当currentNode 指到结尾时， kThNode 即指向倒数第K个节点。
 *
 */
public class KthToTailOfLinklist {
    public static void main(String[] args) {
//        int[] array = {};
        int[] array = {1, 2, 3, 4, 5};
        ListNode head = ListNode.buildList(array);
        KthToTailOfLinklist kthToTailOfLinklist = new KthToTailOfLinklist();
        ListNode kTh = kthToTailOfLinklist.findKthToTail(head, 100);
        ListNode.print(head);
        ListNode.print(kTh);
    }

    public ListNode findKthToTail(ListNode head, int k){
        ListNode currentNode = head;
        ListNode kthNode = head;
        if(k <= 0 || head == null){
            return null;
        }

        for(int i = 0; i < k - 1; ++ i) {
            if(currentNode.next == null) {
                System.out.println("i: " + i + "return null");
                return null;
            }
            currentNode = currentNode.next;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            kthNode = kthNode.next;
        }

        return kthNode;
    }
}
