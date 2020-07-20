class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int i,sum=0,min=prices[0];
        for(i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if ((prices[i]-min)>sum){
                sum = prices[i]-min;
            }
        }
        return sum;
    }
}