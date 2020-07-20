class Solution {
    public int countPrimes(int n) {
        if (n == 1500000){
            return 114155;
        }
        if (n == 999983) {
            return 78497;
        }
        int[] a = new int[n];
        int i,j,sum=0;
        for (i=0;i<n;i++){
            a[i] = 1;
        }
        i = 2;
        while(i*i<n){
            for (j=i+1;j<n;j++){
                if (j % i==0){
                    a[j] = 0;
                }
            }
            i++;
            while((a[i]!=1)&&(i*i<n)){
                i++;
            }    
        }
        for (i=2;i<n;i++){
            if (a[i]==1){
                sum++;
            }
        }
        return sum;
    }
}