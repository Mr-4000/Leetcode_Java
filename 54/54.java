class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m,n,i,j,mode = 1,k;
        List<Integer> ans = new ArrayList();
        if (matrix.length==0) {
            return ans;
        }
        m = matrix.length;
        n = matrix[0].length;
        int[][] use = new int[m][n];
        i = 0;
        j = 0;
        for(k=0;k<m*n;k++) {
            switch(mode) {
                case 1:
                    ans.add(matrix[i][j]);
                    use[i][j] = 1;
                    if (((j+1)==n)||(use[i][j+1]==1)) {
                        mode = 2;
                        i++;
                    }
                    else {
                        j++;
                    }
                    break;
                case 2:
                    ans.add(matrix[i][j]);
                    use[i][j] = 1;
                    if (((i+1)==m)||(use[i+1][j]==1)) {
                        mode = 3;
                        j--;
                    }
                    else {
                        i++;
                    }
                    break;
                case 3:
                    ans.add(matrix[i][j]);
                    use[i][j] = 1;
                    if (((j-1)==-1)||(use[i][j-1]==1)) {
                        mode = 4;
                        i--;
                    }
                    else {
                        j--;
                    }
                    break;
                case 4:
                    ans.add(matrix[i][j]);
                    use[i][j] = 1;
                    if (((i-1)==-1)||(use[i-1][j]==1)) {
                        mode = 1;
                        j++;
                    }
                    else {
                        i--;
                    }
                    break;
                default:
                    break;
            }
        }
        return ans;
    }
}