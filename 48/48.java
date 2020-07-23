class Solution {
    public void rotate(int[][] matrix) {
        a(matrix);
        b(matrix);
    }
    private void a(int[][] matrix) {
        int n = matrix.length,i,j,t;
        for(i=0;i<n;i++) {
            for(j=0;j<=n-i-1;j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = t;
            }
        }
    }
    private void b(int[][] matrix) {
        int n =matrix.length,i,j,t;
        for(i=0;i<n/2;i++) {
            for(j=0;j<n;j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = t;
            }
        }
    }
}