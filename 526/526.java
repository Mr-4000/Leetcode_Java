class Solution {
    public int countArrangement(int N) {
        List<List<Integer>> ans = new ArrayList();
        check(ans, new ArrayList(), new int[N+1], N);
        return ans.size();
    }

    private void check(List<List<Integer>> ans, List<Integer> ele, int[] use, int n) {
        if (ele.size() == n) {
            ans.add(new ArrayList<>(ele));
            return;
        }
        for (int i=1;i<=n;i++) {
            if (use[i]==0) {
                if ((i % (ele.size()+1) == 0)||((ele.size()+1) % i == 0)) {
                    ele.add(i);
                    use[i] = 1;
                    check(ans,ele,use,n);
                    use[i] = 0;
                    ele.remove(ele.size()-1);
                }
            }
        }
    }
}