class Solution {
    public int removeDuplicates(int[] nums) {
        int i,m,n;
        m = 0;
        n = 1;
        for(n=1;n<nums.length;n++){
            if (nums[n]!=nums[m]){
                nums[m+1]=nums[n];
                m++;
            }
        }
        return (m+1);
    }
}