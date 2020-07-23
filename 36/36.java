class Solution {
    public boolean isValidSudoku(char[][] board) {
        return lineCheck(board)&&colCheck(board)&&Check(board);
    }
    private boolean lineCheck(char[][] board) {
        int i,j;
        for(i=0;i<9;i++) {
            List c = new ArrayList();
            for (j=0;j<9;j++) {
                if (board[i][j]!='.') {
                    if (c.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        c.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
    private boolean colCheck(char[][] board) {
        int i,j;
        for(i=0;i<9;i++) {
            List c = new ArrayList();
            for (j=0;j<9;j++) {
                if (board[j][i]!='.') {
                    if (c.contains(board[j][i])) {
                        return false;
                    }
                    else {
                        c.add(board[j][i]);
                    }
                }
            }
        }
        return true;
    }
    private boolean Check(char[][] board) {
        int i,j,m,n;
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++) {
                List c = new ArrayList();
                for(m=0;m<3;m++) {
                    for(n=0;n<3;n++) {
                        if (board[3*i+m][3*j+n]!='.') {
                            if (c.contains(board[3*i+m][3*j+n])) {
                                return false;
                            }
                            else {
                                c.add(board[3*i+m][3*j+n]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}