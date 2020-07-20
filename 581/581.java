class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int m,n,i;
        boolean state;
        state=true;
        for (m=0;m<nums.length && state;m++){
            for (i=m;i<nums.length;i++){
                if (nums[i]<nums[m]){
                    state=false;
                    break;
                }
            }
        }
        state=true;
        for (n=nums.length-1;n>=0 && state;n--){
            for (i=n;i>=0;i--){
                if (nums[i]>nums[n]){
                    state=false;
                    break;
                }
            }
        }
        System.out.println(n);
        System.out.println(m);
        if ((m-1)<(n+1)){
            return (n-m+3);
        }
        else{
            return 0;
        }
    }
}