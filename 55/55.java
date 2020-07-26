class Solution {
    public boolean canJump(int[] nums) {
        int max,i;
        max = 0;
        for (i=0;i<nums.length;i++) {
            if (i>max) {
                return false;
            }
            if (max>=nums.length-1) {
                return true;
            }
            if (nums[i]+i>max) {
                max = nums[i] + i;
            }
        }
        return true;
    }
}