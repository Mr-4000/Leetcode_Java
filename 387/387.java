class Solution {
    public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        int i,j;
        char c='-';
        for(i=0;i<26;i++) {
            alphabet[i] = 0;
        }
        for(i=0;i<s.length();i++) {
            j = s.charAt(i);
            alphabetq[j-97]++;
        }
        for(i=0;i<s.length();i++) {
            j = s.charAt(i);
            if (alphabet[j-97] == 1) {
                return i;
            }
        }
        return -1;
    }
}