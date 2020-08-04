class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if (digits.length()==0) {
            return ans;
        }
        check(digits,0,ans,"");
        return ans;
    }
    private void check(String digits, int x,List<String> ans,String ele) {
        char[][] phone = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        int i,digit;
        if (x==digits.length()) {
            ans.add(ele);
            return;
        }
        digit = digits.charAt(x) - '0';
        for (i=0;i<phone[digit].length;i++) {
            ele = ele + phone[digit][i];
            check(digits,x+1,ans,ele);
            ele = ele.substring(0,ele.length()-1);
        }
    }
}