class Solution {
    public String convert(String s, int numRows) {
        int m,n,i,j,l,k;
        l = s.length();
        String p="";
        m=0;
        n=0;
        k = 2*numRows-2;
        if (k==0){
            return s;
        }
        for(i=0;i<numRows;i++){
            for(j=0;j<l;j++){
                if((j%k==m)||(j%k==n)){
                    p = p + s.charAt(j);
                }
            }
            m=(m+1)%k;
            n=(n-1+k)%k;
        }
        return p;
    }
}
/*
执行用时 :
97 ms
, 在所有 Java 提交中击败了
5.00%
的用户
内存消耗 :
40.4 MB
, 在所有 Java 提交中击败了
84.47%
的用户
*/