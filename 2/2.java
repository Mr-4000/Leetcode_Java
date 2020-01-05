/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode s = new ListNode(0);
        int j=0,t=0;
        s = l3;
        while(!((l1==null)&&(l2==null)&&(j==0))){
            if ((l1==null)&&(l2==null)){
                ListNode l4 = new ListNode(j);
                j=0;
                l3.next = l4;
                l3 = l3.next;
            }
            else {
            if (l1==null){
                t = l2.val+j;
                ListNode l4 = new ListNode(t%10);
                j = t / 10;
                l3.next = l4;
                l3 = l3.next;
            }
            else{
                if (l2==null){
                    t = l1.val + j;
                    ListNode l4 = new ListNode(t%10);
                    j = t / 10;
                    l3.next = l4;
                    l3 = l3.next;
                }
                else{
                    t = l1.val + l2.val + j;
                    ListNode l4 = new ListNode(t%10);
                    j = t / 10;
                    l3.next = l4;
                    l3 = l3.next;
                }
            }
            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }
            }
        }
        return s.next;
    }
}
/*
执行用时 :
2 ms
, 在所有 Java 提交中击败了
99.96%
的用户
内存消耗 :
44.8 MB
, 在所有 Java 提交中击败了
84.11%
的用户
*/
