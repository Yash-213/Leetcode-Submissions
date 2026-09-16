/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var insertGreatestCommonDivisors = function (head) {
    let temp = head;
    while (temp != null && temp.next != null) {
        const a = temp.val;
        const b = temp.next.val;
        const g = gcd(a, b);
        const dummy = new ListNode(g);
        dummy.next = temp.next;
        temp.next = dummy;
        temp = dummy.next;
    }
    return head;
};
const gcd = function (a, b) {
    return a === 0 ? b : gcd(b % a, a);
}