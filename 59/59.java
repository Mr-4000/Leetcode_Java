class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[][] use = new int[n][n];
        int i,j=0,k=0,mode=1;
        for (i=1;i<n*n+1;i++) {
            switch(mode) {
                case 1:
                matrix[j][k] = i;
                use[j][k] = 1;
                if ((k+1 == n)||(use[j][k+1]==1)) {
                    mode = 2;
                    j++;
                }
                else {
                    k++;
                }
                break;
                case 2:
                matrix[j][k] = i;
                use[j][k] = 1;
                if ((j+1 == n)||(use[j+1][k] == 1)) {
                    mode = 3;
                    k--;
                }
                else {
                    j++;
                }
                break;
                case 3:
                matrix[j][k] = i;
                use[j][k] = 1;
                if ((k-1 == -1)||(use[j][k-1] == 1)) {
                    mode = 4;
                    j--;
                }
                else {
                    k--;
                }
                break;
                case 4:
                matrix[j][k] = i;
                use[j][k] = 1;
                if ((j-1 == -1)||(use[j-1][k] == 1)) {
                    mode = 1;
                    k++;
                }
                else {
                    j--;
                }
            }
        }
        return matrix;
    }
}