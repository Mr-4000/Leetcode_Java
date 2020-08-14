class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int i,n=nums.length;
        if (k==0) {
            for (i=0;i<n-1;i++) {
                if ((nums[i]==0)&&(nums[i+1]==0)) {
                    return true;
                }
            }
            return false;
        }
        int[] map = new int[n];
        List<Integer> check = new ArrayList();
        map[0] = nums[0] % k;
        check.add(map[0]);
        for (i=1;i<n;i++) {
            if (nums[i] % k==0) {
                if (nums[i-1] % k==0) {
                    return true;
                }
                map[i] = map[i-1];
                continue;
            }
            map[i] = (map[i-1] + nums[i]) % k;
            if ((map[i]==0)||(check.contains(map[i]))) {
                return true;
            }
            check.add(map[i]);
        }
        return false;
    }
}