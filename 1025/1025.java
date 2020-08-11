class Solution {
    public boolean divisorGame(int N) {
        boolean[] judge = new boolean[N+1];
        if (N==0) {
            return true;
        }
        if (N==1) {
            return false;
        }
        judge[1] = false;
        judge[2] = true;
        int i,j;
        for(i=3;i<=N;i++) {
            for (j=1;j<=i/2;j++) {
                if ((i % j==0)&&(judge[j] == true)) {
                    judge[i] = true;
                    break;
                }
            }
        }
        return judge[N]; 
    }
}