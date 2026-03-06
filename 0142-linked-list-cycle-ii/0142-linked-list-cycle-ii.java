/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int len = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                len = length(slow);
                break;
            }
        }
        if(len == 0) {
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        while(len > 0) {
            s = s.next;
            len--;
        }
        while(f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
    static int length(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(slow != temp);
                return length;
            }
        }
        return 0;
    }
}