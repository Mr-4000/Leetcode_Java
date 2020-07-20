class Solution {
    public void nextPermutation(int[] nums) {
        int n,i,m,l;
        for(n=nums.length-2;n>=0;n--){
            if (nums[n]<nums[n+1]){
                break;
            }
        }
        if (n==-1){
            Arrays.sort(nums);
        }
        else{
            for(m=nums.length-1;m>=0;m--){
                if (nums[m]>nums[n]){
                    break;
                }
            }
            l = nums[m];
            nums[m] = nums[n];
            nums[n] = l;
            Arrays.sort(nums,n+1,nums.length);
        }
    }
}