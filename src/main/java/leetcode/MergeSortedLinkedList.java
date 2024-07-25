package leetcode;

/**
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/">problem</a>
 * @author snowmeow
 */
public class MergeSortedLinkedList {

    public ListNode mergeTwoLists(ListNode cur1, ListNode cur2) {
        if (cur1 == null) {
            return cur2;
        }
        if (cur2 == null) {
            return cur1;
        }
        ListNode pre = null;
        ListNode root = cur1;
        while(true) {
            if (cur2 == null) {
                break;
            }
            if (cur1.val > cur2.val) {
                ListNode t = cur2.next;
                if (pre == null) {
                    root = cur2;
                    cur2.next = cur1;
                    pre = cur2;
                } else {
                    pre.next = cur2;
                    cur2.next = cur1;
                    pre = cur2;
                }
                cur2 = t;
            } else if (cur1.next == null){
                cur1.next = cur2;
                break;
            } else {
                pre = cur1;
                cur1 = cur1.next;
            }
        }
        return root;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

