class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int y,z;
        y=x;
        z=0;
        while (y>0){
           z = z*10 + y%10;
           y = y/10; 
        }
        if (z==x){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
执行用时 :
9 ms
, 在所有 Java 提交中击败了
99.00%
的用户
内存消耗 :
40.9 MB
, 在所有 Java 提交中击败了
5.01%
的用户
*/