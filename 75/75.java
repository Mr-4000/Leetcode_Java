class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1,p=0;
        for (p=0;p<nums.length;p++) {
            if (nums[p]==0) {
                swap(nums,p,l);
                l++;
            }
            else {
                if (nums[p]==2) {
                    swap(nums,p,r);
                    r--;
                    p--;
                }
            }
            if (p>=r) {
                break;
            }
        }
    }
    private void swap(int[]nums,int a,int b){
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}