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
    public ListNode removeNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        int n = values.size();

        int[] maxRight = new int[n];
        maxRight[n - 1] = values.get(n - 1);

        for (int i = n - 2; i >= 0; i--)
            maxRight[i] = Math.max(values.get(i), maxRight[i + 1]);

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        int i = 0;

        while (curr != null) {
            if (curr.val < maxRight[i])
                prev.next = curr.next;
            else
                prev = curr;
            curr = curr.next;
            i++;
        }

        return dummy.next;
    }
}