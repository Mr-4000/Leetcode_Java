class Solution {
    public int singleNumber(int[] nums) {
        int i,n=0;
        for(i=0;i<nums.length;i++){
            n=n^nums[i];
        }
        return n;
    }
}