class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList(); 
        make(ans,new StringBuilder(),0,0,n);
        return ans; 
    }
    private void make(List<String> ans, StringBuilder sb,int l,int r,int n) {
        if ((l==r)&&(l==n)) {
            ans.add(sb.toString());
            return;
        }
        if (l==n) {
            sb.append(')');
            make(ans,sb,l,r+1,n);
            sb.deleteCharAt(sb.toString().length()-1);
        }
        else {
            if (l>r) {
                sb.append('(');
                make(ans,sb,l+1,r,n);
                sb.deleteCharAt(sb.toString().length()-1);
                sb.append(')');
                make(ans,sb,l,r+1,n);
                sb.deleteCharAt(sb.toString().length()-1);
            }
            else {
                sb.append('(');
                make(ans,sb,l+1,r,n);
                sb.deleteCharAt(sb.toString().length()-1);
            }
        }
    }
}