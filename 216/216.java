class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        check(ans,k,n,new ArrayList(),0);
        return ans;
    }

    private void check(List<List<Integer>> ans, int k,int n,List<Integer> temp,int r) {
        if ((k==0)&&(n==0)) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if ((k<0)||(n<0)) {
            return;
        }
        for (int i=r+1;i<=9;i++) {
            temp.add(i);
            check(ans,k-1,n-i,temp,i);
            temp.remove(temp.size()-1);
        }
    }
}