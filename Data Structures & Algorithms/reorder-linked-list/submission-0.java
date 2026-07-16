/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode halfStart = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = halfStart;

        while(curr != null){
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }

        halfStart = prev;

        curr = head;
        while(halfStart != null){
            ListNode t1 = curr.next;
            ListNode t2 = halfStart.next;
            curr.next = halfStart;
            halfStart.next = t1;
            curr = t1;
            halfStart = t2;
        }

        // return head;
    }
}
