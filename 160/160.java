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
执行用时 :
8 ms
, 在所有 Java 提交中击败了
20.26%
的用户
内存消耗 :
45.2 MB
, 在所有 Java 提交中击败了
8.63%
的用户
*/