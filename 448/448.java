class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] pd = new int[nums.length];
        int i;
        for(i=0;i<nums.length;i++){
            pd[i]=0;
        }
        for(i=0;i<nums.length;i++){
            pd[nums[i]-1]++;
        }
        for(i=0;i<nums.length;i++){
            if (pd[i]==0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}