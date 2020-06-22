class Solution {
    public int hammingDistance(int x, int y) {
        int n=0;
        while ((x!=0)||(y!=0)) {
            if ((x%2)!=(y%2)){
                n=n+1;
            }
            x=x/2;
            y=y/2;
        }
        return n;
    }
}
//执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
//内存消耗：
36.6 MB
, 在所有 Java 提交中击败了
6.45%
的用户