class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> t = new ArrayList();
        ans.add(t);
        int i,j,m,p,n;
        for (i=0;i<nums.length;i++) {
            p = ans.size();
            for (j=0;j<p;j++) {
                List<Integer> s = new ArrayList();
                for (n=0;n<ans.get(j).size();n++) {
                    s.add(ans.get(j).get(n));
                }
                s.add(nums[i]);
                ans.add(s);
            }
        }
        return ans;
    }
}