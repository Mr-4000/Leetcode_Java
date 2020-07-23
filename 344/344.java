class Solution {
    public void reverseString(char[] s) {
        int i,j;
        char c;
        j = s.length-1;
        i = 0;
        while(i<j) {
            c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}