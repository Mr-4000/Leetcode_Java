class Solution {
    public int search(int[] nums, int target) {
        int l,r,m = 0;
        l = 0;
        r = nums.length - 1;
        while (l<=r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < nums[l]) {
                if (nums[m] < target) {
                    if (nums[l] <= target) {
                        r = m-1;
                    }
                    else {
                        l = m+1;
                    }
                }
                else {
                    r = m-1;
                }
            }
            else {
                if (nums[m] < target) {
                    l = m+1;
                }
                else {
                    if (target < nums[l]) {
                        l = m+1;
                    }
                    else {
                        r = m-1;
                    }
                }
            }
        }
        return -1;
    }   
}