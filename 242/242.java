class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        int i,j,m;
        for (i=0;i<s.length();i++){
            j = s.charAt(i);
            alphabet[j-97]++;
        }
        for (i=0;i<t.length();i++){
            j = t.charAt(i);
            alphabet[j-97]--;
        }
        for (i=0;i<26;i++){
            if (alphabet[i]!=0){
                return false;
            }
        }
        return true;
    }
}