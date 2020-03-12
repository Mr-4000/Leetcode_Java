/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l = l3;
        while((l1!=null)||(l2!=null)){
            if (l1==null){
                l3.next=l2;
                return l.next;
            }
            if (l2==null){
                l3.next=l1;
                return l.next;
            }
            if (l1.val<l2.val){
                l3.next = l1;
                l3=l3.next;
                l1=l1.next;
            }
            else{
                l3.next = l2;
                l3=l3.next;
                l2=l2.next;
            }
        }
        return l.next;
    }
}
/*
ִ����ʱ :
1 ms
, ������ Java �ύ�л�����
82.55%
���û�
�ڴ����� :
38.9 MB
, ������ Java �ύ�л�����
49.83%
���û�
*/