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
执行用时 :
4 ms
, 在所有 Java 提交中击败了
30.55%
的用户
内存消耗 :
45.3 MB
, 在所有 Java 提交中击败了
5.02%
的用户
*/