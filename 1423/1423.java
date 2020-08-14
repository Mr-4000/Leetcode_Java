class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length,i,j,max=0,sum;
        for (i=0;i<k;i++) {
            max = max + cardPoints[i];
        }
        sum = max;
        for (i=0;i<k;i++) {
            sum = sum - cardPoints[k-i-1] + cardPoints[n-i-1];
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
}