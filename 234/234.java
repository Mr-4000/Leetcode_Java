/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> value = new ArrayList<>();
        while(head!=null){
            value.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = value.size()-1;
        while(l<r){
            if (!value.get(l).equals(value.get(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
/*
ִ����ʱ :
4 ms
, ������ Java �ύ�л�����
30.55%
���û�
�ڴ����� :
45.3 MB
, ������ Java �ύ�л�����
5.02%
���û�
*/