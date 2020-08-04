class Solution {
    public String addStrings(String num1, String num2) {
        int i,j,plus=0,n1=0,n2=0;
        StringBuilder sb = new StringBuilder();
        i = num1.length()-1;
        j = num2.length()-1;
        while ((i>=0)||(j>=0)||(plus>0)) {
            if (i>=0) {
                n1 = num1.charAt(i) - '0';
            }
            if (j>=0) {
                n2 = num2.charAt(j) - '0';
            }
            plus = n1 + n2 + plus;
            sb.append(plus % 10);
            plus = plus / 10;
            i--;
            j--;
            n1 = 0;
            n2 = 0;
        }
        return sb.reverse().toString();
    }
}