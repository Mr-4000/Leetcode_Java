class Solution {
    public int uniquePaths(int m, int n) {
        int i,j;
        int[][] table = new int[m][n];
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                if (i==0) {
                    table[i][j] = 1;
                }
                else {
                    if (j == 0) {
                        table[i][j] = 1;
                    }
                    else {
                        table[i][j] = table[i-1][j] + table[i][j-1];
                    }
                }
            }
        }
        return table[m-1][n-1];
    }
}