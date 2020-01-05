class Solution {
    public String longestPalindrome(String s) {
        int l,i,j;
        l = s.length();
        j = s.length();
        while(j>0)
        {
            for(i=0;i<=l-j;i++){
                if (pd(s,i,i+j-1)){
                    return (s.substring(i,i+j));
                }
            }
            j = j - 1;
        }
        return "";
    }
    private boolean pd(String s,int m,int n) {
        while (m<n){
            if (s.charAt(m)!=s.charAt(n)){
                return false;
            }
            m++;
            n--;
        }
        return true;
    }
}
/*
执行用时 :
115 ms
, 在所有 Java 提交中击败了
23.74%
的用户
内存消耗 :
36 MB
, 在所有 Java 提交中击败了
91.50%
的用户
*/