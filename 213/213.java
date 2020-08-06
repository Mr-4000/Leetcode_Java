class Solution {
    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        return Math.max(res(Arrays.copyOfRange(nums,0,nums.length-1)),res(Arrays.copyOfRange(nums,1,nums.length)));
    }

    private int res(int[] nums) {
        int[] record = new int[nums.length];
        int i;
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        record[0]=nums[0];
        record[1]=Math.max(nums[0],nums[1]);
        for (i=2;i<nums.length;i++){
            record[i] = Math.max(record[i-1],record[i-2]+nums[i]);
        }
        return record[nums.length-1];
    }
}