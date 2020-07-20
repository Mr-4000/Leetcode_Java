class Solution {
    public int titleToNumber(String s) {
        int sum,i,j;
        sum = 0;
        for (i=0;i<s.length();i++){
            j = s.charAt(i);
            sum = sum * 26 + j - 64;
        }
        return sum;
    }
}