class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode re = reverse(slow);
        return isPal(head, re);
    }
    private static ListNode reverse (ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    private static boolean isPal (ListNode head, ListNode reverse) {
        ListNode f = head;
        ListNode s = reverse;
        while (s != null) {
            if (f.val != s.val) return false;
            f = f.next;
            s = s.next;
        }
        return true;
    }
}