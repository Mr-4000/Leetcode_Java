class Solution {
    public int maxProfit(int[] prices) {
        int sum,now,i,j;
        sum = 0;
        now = 0;
        for (i=0;i<prices.length;i++){
            if ((i==0)||(prices[i]<prices[i-1])){
                now=prices[i];
            }
            if ((i==prices.length-1)||(prices[i]>prices[i+1])){
                sum = sum + prices[i] - now;
            }
        }   
        return sum;
    }
}