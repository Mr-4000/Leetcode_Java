/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head!=null){
            ListNode reverse1 = new ListNode(head.val);
            reverse1.next = reverse;
            reverse=reverse1;
            head=head.next;
        }
        return reverse;
    }
}