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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null ) {
            int a = temp.val;
            int b = temp.next.val;
            int gcd = gcd(a, b);
            ListNode dummy = new ListNode();
            dummy.val = gcd;
            dummy.next = temp.next;
            temp.next = dummy;
            temp = dummy.next;
        }
        return head;
    }
    int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}