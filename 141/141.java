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
/*执行用时 :
4 ms
, 在所有 Java 提交中击败了
26.11%
的用户
内存消耗 :
42 MB
, 在所有 Java 提交中击败了
5.03%
的用户*/