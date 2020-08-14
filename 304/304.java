class NumMatrix {
    int[][] map;
    public NumMatrix(int[][] matrix) {
        if (matrix.length==0) {
            return;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        map = new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (j==0) {
                    map[i][j] = matrix[i][j];
                }
                else {
                    map[i][j] = map[i][j-1] + matrix[i][j];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for (int i=row1;i<=row2;i++) {
            sum = sum + map[i][col2];
            if (col1!=0) {
                sum = sum - map[i][col1-1];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */