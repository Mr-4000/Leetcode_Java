class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0,r = nums.length - 1,m = 0,f = -1;
        int[] ans = new int[2];
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) {
                f = m;
                break;
            }
            if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        if (f == -1) {
            ans[0] = f;
            ans[1] = f;
            return ans;
        }
        while ((f>=0)&&(nums[f]==target)) {
            f--;
        }
        f++;
        ans[0] = f;
        while ((f<nums.length)&&(nums[f]==target)) {
            f++;
        }
        f--;
        ans[1] = f;
        return ans;
    }
}