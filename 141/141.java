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
    public boolean hasCycle(ListNode head) {
        HashSet set = new HashSet();
        while(head!=null){
            if (set.contains(head)){
                return true;
            }
            else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
/*ִ����ʱ :
4 ms
, ������ Java �ύ�л�����
26.11%
���û�
�ڴ����� :
42 MB
, ������ Java �ύ�л�����
5.03%
���û�*/