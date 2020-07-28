/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if ((head==null)||(head.next==null)) {
            return head;
        }
        int l = 0;
        ListNode zcl = new ListNode();
        ListNode pre = new ListNode();
        pre.next = head;
        zcl = head;
        while(zcl!=null) {
            l++;
            zcl = zcl.next;
        }
        k = k % l;
        zcl = head;
        while (k!=0) {
            zcl = zcl.next;
            k--;
        }
        while (zcl.next!=null) {
            head = head.next;
            zcl = zcl.next;
        }
        zcl.next = pre.next;
        pre = head.next;
        head.next = null;
        return pre;
    }
}