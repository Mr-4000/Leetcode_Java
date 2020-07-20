class Solution {
    public void rotate(int[] nums, int k) {
        int i,j,temp;
        for (i=0;i<k;i++){
            temp = nums[nums.length-1];
            for (j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0] = temp;
        }
    }
}