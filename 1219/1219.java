class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int i,j;
        List<Integer> ans = new ArrayList();
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                find(ans,grid,new int[m][n],i,j,0);
            }
        }
        return Collections.max(ans);
    }

    private void find(List<Integer> ans,int[][] grid,int[][] use,int i,int j,int now) {
        if ((i<0)||(i==grid.length)||(j<0)||(j==grid[0].length)||(use[i][j]==1)||(grid[i][j]==0)) {
            ans.add(now);
            return;
        }
        use[i][j] = 1;
        now = now + grid[i][j];
        find(ans,grid,use,i+1,j,now);
        find(ans,grid,use,i-1,j,now);
        find(ans,grid,use,i,j+1,now);
        find(ans,grid,use,i,j-1,now);
        use[i][j] = 0;
        now = now - grid[i][j];
    }
}