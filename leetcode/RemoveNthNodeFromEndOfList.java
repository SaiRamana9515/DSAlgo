package leetcode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 *
 * Input: head = [1], n = 1
 * Output: []
 *
 * Input: head = [1,2], n = 1
 * Output: [1]
 *
 * Constraints:
 *
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head), pos=0;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode currNode = dummyHead;
        while(pos < (size-n)){
            currNode = currNode.next;
            pos++;
        }
        //System.out.println(currNode.val);
        currNode.next = currNode.next.next;
        return dummyHead.next;
    }
    public int getSize(ListNode head){
        int size=0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            size++;
        }
        return size;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}