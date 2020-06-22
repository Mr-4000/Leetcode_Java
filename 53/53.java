class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],i=0;
        for (i=1;i<nums.length;i++){
            if (nums[i-1]>0){
                nums[i]=nums[i]+nums[i-1];
            }
            if (max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
//执行用时：
1 ms
, 在所有 Java 提交中击败了
95.16%
的用户
内存消耗：
39.6 MB
, 在所有 Java 提交中击败了
40.45%
的用户