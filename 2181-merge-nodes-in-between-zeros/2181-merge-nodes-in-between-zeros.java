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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            ListNode curr = temp.next;
            int sum = 0;

            while (curr != null && curr.val != 0) {
                sum += curr.val;
                curr = curr.next;
            }

            ListNode merge = new ListNode(sum);

            merge.next = curr != null ? curr.next : null;
            temp.next = merge;

            temp = merge;
        }
        return head.next;
    }
}