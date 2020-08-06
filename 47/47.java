class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int i;
        check(ans,nums,new int[nums.length],new ArrayList());
        HashSet res = new HashSet();
        res.addAll(ans);
        ans.clear();
        ans.addAll(res);
        return ans;
    }

    private void check(List<List<Integer>> ans,int[] nums, int[] use, List<Integer> ele) {
        if (ele.size()==nums.length) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        for (int i=0;i<nums.length;i++) {
            if (use[i]==0) {
                use[i] = 1;
                ele.add(nums[i]);
                check(ans,nums,use,ele);
                ele.remove(ele.size()-1);
                use[i] = 0;
            }
        }
    }
}