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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (fast.next == null) return null;
        else if (fast.next.next == null) fast.next = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while (slow != null && slow.next != null) {
            if (slow.next.next == null) {
                slow.val = slow.next.val;
                slow.next = null;
                break;
            }
            slow.val = slow.next.val;
            slow = slow.next;
        }
        return head;
    }
}