class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        int[] check = new int[26];
        int i,j;
        for (i=0;i<s1.length();i++) {
            j = s1.charAt(i) - 97;
            check[j]++;
        }
        for (i=0;i<s2.length();i++) {
            j = s2.charAt(i) - 97;
            check[j]--;
        }
        for (i=0;i<26;i++) {
            if (check[i]!=0) {
                return false;
            }
        }
        return true;
    }
}