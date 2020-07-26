class Solution {
    public void setZeroes(int[][] matrix) {
        int m,n,i,j,num=0;
        m = matrix.length;
        if (m==0) {
            return;
        }
        n = matrix[0].length;
        int[][] map = new int[m*n][2];
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                if (matrix[i][j] == 0) {
                    map[num][0] = i;
                    map[num][1] = j;
                    num++;
                }
            }
        }
        for (i=0;i<num;i++) {
            for (j=0;j<n;j++) {
                matrix[map[i][0]][j] = 0;
            }
            for (j=0;j<m;j++) {
                matrix[j][map[i][1]] = 0;
            }
        }
    }
}