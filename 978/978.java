class Solution {
    public int maxTurbulenceSize(int[] A) {
        int n=A.length;
        if (n==0) {
            return 0;
        }
        int[] up = new int[n];
        int[] down = new int[n];
        up[0]=1;
        down[0]=1;
        int i,j,s=1;
        for (i=1;i<n;i++) {
            if (A[i]==A[i-1]) {
                up[i] = 1;
                down[i] = 1;
                continue;
            }
            if (i%2==0) {
                if (A[i]>A[i-1]) {
                    up[i]=up[i-1]+1;
                    down[i]=1;
                }
                else {
                    down[i]=down[i-1]+1;
                    up[i]=1;
                }
            }
            else {
                if (A[i]>A[i-1]) {
                    down[i]=down[i-1]+1;
                    up[i]=1;
                }
                else {
                    up[i]=up[i-1]+1;
                    down[i]=1;
                }
            }
            if (s<up[i]) {
                s = up[i];
            }
            if (s<down[i]) {
                s = down[i];
            }
        }
        return s;
    }
}