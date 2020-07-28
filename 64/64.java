class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length,i,j;
        int[][] map = new int[m][n];
        map[0][0] = grid[0][0];
        for (i=1;i<m;i++) {
            map[i][0] = grid[i][0] + map[i-1][0];
        }
        for (j=1;j<n;j++) {
            map[0][j] = grid[0][j] + map[0][j-1];
        }
        for (i=1;i<m;i++) {
            for (j=1;j<n;j++) {
                map[i][j] = grid[i][j] + Math.min(map[i-1][j],map[i][j-1]);
            }
        }
        return map[m-1][n-1];
    }
}