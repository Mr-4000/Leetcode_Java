class Solution {
    public boolean isPowerOfFour(int num) {
        if (num==0){
            return false;
        }
        while(num%4==0)
            num=num/4;
        if (num==1){
            return true;
        }
        else{
            return false;
        }
    }
}
/*
执行用时 :
1 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗 :
36.4 MB
, 在所有 Java 提交中击败了
5.01%
的用户
*/