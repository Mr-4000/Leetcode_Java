class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        pick(ans,target,candidates,new ArrayList(),0);
        return ans;
    }
    private void pick(List<List<Integer>> ans, int target, int[] candidates,List<Integer> n,int m) {
        if (target==0) {
            ans.add(new ArrayList<>(n));
            return;
        }
        if (target<0) {
            return;
        }
        for (int i=m;i<candidates.length;i++) {
            target = target - candidates[i];
            n.add(candidates[i]);
            pick(ans,target,candidates,n,i);
            target = target + candidates[i];
            n.remove(n.size()-1);
        }
    }
}