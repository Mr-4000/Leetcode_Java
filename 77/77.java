class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        check(ans,new ArrayList(),n,k,1);
        return ans;
    }

    private void check(List<List<Integer>> ans,List<Integer> ele, int n,int k,int r) {
        if (ele.size()==k) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        for (int i=r;i<=n;i++) {
            ele.add(i);
            check(ans,ele,n,k,i+1);
            ele.remove(ele.size()-1);
        }
    }
}