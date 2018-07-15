package niuke.swordoffer;

/**
 * test
 *
 * @author nanj
 * @date 2018/7/14
 */
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    public void printNextS() {
        RandomListNode current = this;
        System.out.println("next:");
        while (current != null) {
            System.out.print(current.label + ",");
            current = current.next;
        }
    }
    public void printRandomS() {
        RandomListNode current = this;
        System.out.println();
        System.out.println("Random:");
        while (current != null) {
            System.out.print(current.label + ",");
            current = current.random;
        }
    }
}
