class Solution {
    public void moveZeroes(int[] nums) {
        int m,n,i;
        m = 0;
        n = 0;
        while (m<nums.length){
            if ((nums[n]==0)&&(nums[m]==0)){
                m++;
                continue;
            }
            if ((nums[n]==0)&&(nums[m]!=0)){
                i = nums[m];
                nums[m] = nums[n];
                nums[n] = i;
            }
            m++;
            n++;
        }
    }
}