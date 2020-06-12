/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet a=new HashSet<>();
        while(headA!=null){
            a.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if (a.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
/*
ִ����ʱ :
8 ms
, ������ Java �ύ�л�����
20.26%
���û�
�ڴ����� :
45.2 MB
, ������ Java �ύ�л�����
8.63%
���û�
*/