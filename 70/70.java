class Solution {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int[] a= new int[n+1];
        int i;
        a[1]=1;
        a[2]=2;
        for(i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}