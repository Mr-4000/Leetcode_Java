class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList();
        ans.add(S);
        make(ans,S,0);
        HashSet zcl = new HashSet();
        zcl.addAll(ans);
        ans.clear();
        ans.addAll(zcl);
        return ans;
    }

    private void make(List<String> ans, String s, int x) {
        if (x==s.length()) {
            return;
        }
        if (s.charAt(x)>'9') {
            s = s.substring(0,x) + s.substring(x,x+1).toLowerCase() + s.substring(x+1,s.length());
            ans.add(s);
            make(ans,s,x+1);
            s = s.substring(0,x) + s.substring(x,x+1).toUpperCase() + s.substring(x+1,s.length());
            ans.add(s);
            make(ans,s,x+1);
        }
        else {
            make(ans,s,x+1);
        }
    }
}