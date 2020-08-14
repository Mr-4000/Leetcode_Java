class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int[] map = new int[10001];
        int[] check = new int[10001];
        int i,max=0,sum,min=10001;
        for (i=0;i<nums.length;i++) {
            if (max<nums[i]) {
                max = nums[i];
            }
            if (min>nums[i]) {
                min = nums[i];
            }
            map[nums[i]] = map[nums[i]] + nums[i];
        }
        for (i=min;i<=max;i++) {
            if (i==1) {
                check[i] = map[i];
            }
            else {
                check[i] = Math.max(check[i-1],check[i-2]+map[i]);
            }
        }
        return check[max];
    }
}