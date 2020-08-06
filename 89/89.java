class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList();
        ans.add(0);
        if (n==0) {
            return ans;
        }
        ans.add(1);
        if (n==1) {
            return ans;
        }
        make(ans,n,1);
        return ans;
    }

    private void make(List<Integer> ans, int n, int x) {
        if (x==n) {
            return;
        }
        List<Integer> res = new ArrayList();
        int i,j;
        for (i=0;i<ans.size();i++) {
            j = (0 << x) + ans.get(i);
            res.add(j);
        }
        for (i=ans.size()-1;i>=0;i--) {
            j = (1 << x) + ans.get(i);
            res.add(j);
        }
        ans.clear();
        ans.addAll(res);
        make(ans,n,x+1);
    }
}