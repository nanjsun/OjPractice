package niuke;

import niuke.swordoffer.ListNode;

/**
 * test
 *
 * @author nanj
 * @date 2018/9/21
 */
public class EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead) {
        int loopSize = loopSize(pHead);

        if (loopSize == 0) {
            return null;
        } else {
            ListNode right = pHead;
            ListNode left = pHead;
            for (int i = 0; i < loopSize; ++i) {
                right = right.next;
            }
            while (right != left) {
                right = right.next;
                left = left.next;
            }
            return right;
        }
    }

    private int loopSize(ListNode pHead) {
        ListNode single = pHead;
        if (single.next == null) {
            return 0;
        }
        ListNode doubleIndex = single.next;
        int size;


        while (true) {
            if (doubleIndex.next == null) {
                return 0;
            }
            if (single == doubleIndex) {
                size = 2;
                single = single.next;
                while (single != doubleIndex) {
                    single = single.next;
                    size++;
                }
                break;
            } else {
                doubleIndex = doubleIndex.next.next;
                single = single.next;
            }

        }
        return size;
    }

}
