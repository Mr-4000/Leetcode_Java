class Solution {
    public int findLength(int[] A, int[] B) {
        int[][] map = new int[A.length+1][B.length+1];
        int i,j,max=0;
        for (i=1;i<=A.length;i++) {
            for (j=1;j<=B.length;j++) {
                if (A[i-1]==B[j-1]) {
                    map[i][j] = map[i-1][j-1] + 1;
                }
                if (max<map[i][j]) {
                    max = map[i][j];
                }
            }
        }
        return max;
    }
}