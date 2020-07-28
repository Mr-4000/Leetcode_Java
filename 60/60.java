class Solution {
    public String getPermutation(int n, int k) {
        if (n==1) {
            return "1";
        }
        double[] map = {1,2,6,24,120,720,5040,40320,362880};
        int[] use = new int[n];
        int i,j,index=0,ans = 0;
        for (i = 0;i<n-1;i++) {
            j = (int)Math.ceil(k / map[n-2-i]);
            index = 0;
            while (j>0) {
                if (use[index]==0) {
                    j--;
                    index++;
                }
                else {
                    index++;
                }
            }
            index--;
            use[index] = 1;
            ans = ans * 10 + index + 1;
            k = k % (int)map[n-2-i];
            if (k==0) {
                for (j=n-1;j>=0;j--) {
                    if (use[j] == 0) {
                        use[j] = 1;
                        ans = ans * 10 + j + 1;
                    }
                }
                break;
            }
        }
        for (i=0;i<n;i++){
            if (use[i]==0){
                ans = 10*ans + i + 1;
                break;
            }
        }
        return Integer.toString(ans);
    }
}