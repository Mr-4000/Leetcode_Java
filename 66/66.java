class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        digits[i]++;
        while (digits[i]==10){
            if(i==0){
                break;
            }
            digits[i]=0;
            i--;
            digits[i]++;
        }
        if (digits[i]==10){
            int[] dig = new int[digits.length+1];
            dig[0]=1;
            for (i=1;i<dig.length;i++){
                dig[i]=0;
            }
            return dig;
        }
        return digits;
    }
}