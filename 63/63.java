class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m,n,i,j;
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        if (obstacleGrid[0][0]==1){
            return 0;
        }
        else {
            map[0][0] = 1;
        }
        for (i=1;i<m;i++) {
            if (obstacleGrid[i][0]!=1) {
                map[i][0] = map[i-1][0];
            }
        }
        for (j=1;j<n;j++) {
            if (obstacleGrid[0][j]!=1) {
                map[0][j] = map[0][j-1];
            }
        }
        for (i=1;i<m;i++) {
            for (j=1;j<n;j++) {
                if (obstacleGrid[i][j]!=1) {
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
            }
        }
        return map[i-1][j-1];
    }
}