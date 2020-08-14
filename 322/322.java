class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] map = new int[amount+1];
        int i,j;
        for (i=1;i<=amount;i++) {
            map[i]=amount+1;
            for (j=0;j<coins.length;j++) {
                if ((i-coins[j])<0) {
                    continue;
                }
                map[i] = Math.min(map[i],map[i-coins[j]]+1);
            }
        }
        if (map[amount]!=amount+1) {
            return map[amount];
        }
        return -1;
    }
}