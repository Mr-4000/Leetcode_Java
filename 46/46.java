class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int[] use = new int[nums.length];
        make(ans,nums,use,new ArrayList<Integer>());
        return ans;
    }

    private void make(List<List<Integer>> ans, int[] nums, int[] use,ArrayList<Integer> ele) {
        if (ele.size()==nums.length) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        for (int i=0;i<nums.length;i++) {
            if (use[i] == 0) {
                ele.add(nums[i]);
                use[i] = 1;
                make(ans,nums,use,ele);
                use[i] = 0;
                ele.remove(ele.size() - 1);
            }
        }
    }
}