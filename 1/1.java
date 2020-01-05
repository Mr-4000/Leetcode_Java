class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        int i,j,l;
        l = nums.length;
        for(i=0;i<l-1;i++){
            for(j=i+1;j<l;j++){
                if ((nums[i]+nums[j])==target){
                    n[0]=i;
                    n[1]=j;
                    return n;
                }
            }
        }
        return null;
    }
}
//执行用时 :25 ms, 在所有 Java 提交中击败了34.89%的用户
//内存消耗 :37.3 MB, 在所有 Java 提交中击败了89.77%的用户