class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        check(ans,candidates,target,new ArrayList(),-1);
        HashSet<List<Integer>> temp = new HashSet();
        temp.addAll(ans);
        ans.clear();
        ans.addAll(temp);
        return ans;
    }

    private void check(List<List<Integer>> ans,int[] candidates,int target,List<Integer> ele,int n) {
        if (target==0) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        for (int i=n+1;i<candidates.length;i++) {
            if (target>=candidates[i]) {
                ele.add(candidates[i]);
                check(ans,candidates,target-candidates[i],ele,i);
                ele.remove(ele.size()-1);
            }
        }
    }
}