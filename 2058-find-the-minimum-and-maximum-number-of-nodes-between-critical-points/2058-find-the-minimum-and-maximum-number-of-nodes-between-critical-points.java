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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int idx = 1;
        if (head == null)
            return new int[] { -1, -1 };
            
        ListNode temp = head.next;
        int pre = head.val;

        List<Integer> list = new ArrayList<>();

        while (temp != null && temp.next != null) {
            if (pre > temp.val && temp.val < temp.next.val) {
                list.add(idx);
            }
            if (pre < temp.val && temp.val > temp.next.val) {
                list.add(idx);
            }
            idx++;
            pre = temp.val;
            temp = temp.next;
        }
        if (list.size() < 2)
            return new int[] { -1, -1 };

        Collections.sort(list);

        int distMax = list.get(list.size() - 1) - list.get(0);

        int distMin = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            distMin = Math.min(distMin, list.get(i) - list.get(i - 1));
        }

        return new int[] { distMin, distMax };
    }
}