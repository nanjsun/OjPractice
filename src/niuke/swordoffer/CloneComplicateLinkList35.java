package niuke.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * test
 *
 * @author nanj
 * @date 2018/7/14
 */
public class CloneComplicateLinkList35 {

    public RandomListNode Clone(RandomListNode pHead){

        if(pHead==null) {
            return null;
        }
        RandomListNode pCur = pHead;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
         while(pCur!=null){
         RandomListNode node = new RandomListNode(pCur.label);
         node.next = pCur.next;
         pCur.next = node;
         pCur = node.next;
         }
         pCur = pHead;
         //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点

        while(pCur!=null){
            if(pCur.random!=null){
                pCur.next.random = pCur.random.next;
            }
            pCur = pCur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pCur = pHead;
        //拆分链表

        while(pCur!=null){
            pCur.next = pCur.next.next;
            if(cur.next!=null){
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pCur = pCur.next;
        }
        return head;
    }


    public static void main(String[] args){
        CloneComplicateLinkList35 cloneComplicateLinkList35 = new CloneComplicateLinkList35();

        RandomListNode pHead = new RandomListNode(0);
        RandomListNode current = new RandomListNode(0);
        pHead.next = current;
        int[] labels = {1,2,3,4,5,6,7};
        for (int i :
                labels) {
            current.label = i;
            current.next = new RandomListNode(i);
            current = current.next;
        }
//        current.label = ;

        pHead.printNextS();
        pHead.printRandomS();


        RandomListNode newHead = cloneComplicateLinkList35.Clone(pHead);
        newHead.printNextS();
        newHead.printRandomS();
    }
}
