class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i,j,m;
        for (i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for (i=0;i<=nums.length;i++){
            if (!list.contains(i)){
                return i;
            }
        }
        return 0;
    }
}