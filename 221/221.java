class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        if (m==0) {
            return 0;
        }
        int n=matrix[0].length, i,j,max=0;
        int[][] dp = new int[m][n];
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                if (matrix[i][j]=='1') {
                    if ((i==0)||(j==0)) {
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]);
                        dp[i][j] = Math.min(dp[i][j],dp[i][j-1]) + 1;
                    }
                    if (max<dp[i][j]) {
                        max = dp[i][j];
                    }
                }
            }
        }
        return max*max;
    }
}