class Solution {
    public int reverse(int x) {
        long t=1,n=0,m;
        int s;
        if (x<0){
            t=-1;
            x = 0-x;
        }
        while(x>0){
            m = x % 10;
            n = n * 10 + m;
            x = x / 10;
        }
        n = t*n;
        if ((n>2147483647)||(n<-2147483648)){
            n=0;
        }
        return ((int)n);
    }
}
/*
执行用时 :
1 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗 :
33.8 MB
, 在所有 Java 提交中击败了
79.15%
的用户
*/