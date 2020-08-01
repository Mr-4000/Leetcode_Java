class Solution {
    public int myAtoi(String str) {
        int ans=0,j,l = str.length(),fl=1,digit;
        j = 0;
        while ((j<l)&&(str.charAt(j)==' ')) {
            j++;
        }
        if (j==l) {
            return 0;
        }
        if (str.charAt(j)=='-') {
            fl = -1;
            j++;
        }
        else {
            if (str.charAt(j)=='+') {
                j++;
            }
        }
        while ((j<l)&&(str.charAt(j)>='0')&&(str.charAt(j)<='9')) {
            digit = str.charAt(j) - 48;
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return fl>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            j++;
        }
        return ans*fl;
    }
}