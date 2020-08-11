class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length];
        int s=0;
        for (int i=0;i<nums.length;i++) {
            s = s + nums[i];
            sum[i] = s;
        }
    }
    
    public int sumRange(int i, int j) {
        if (i==0) {
            return sum[j];
        }
        else {
            return sum[j]-sum[i-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */