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
    public boolean isPalindrome(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode h1 = head;
        while (h1 != null) {
            l.add(h1.val);
            h1 = h1.next;
        }
        return isPal(l);
    }
    private static boolean isPal(List<Integer> l) {
        int s = 0, e = l.size() - 1;
        while (s < e) {
            if (l.get(s) != l.get(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}