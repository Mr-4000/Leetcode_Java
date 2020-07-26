class Solution {
    public int numDecodings(String s) {
        int[] map = new int[s.length()];
        if ((s.length()==0)||(s.charAt(0)=='0')) {
            return 0;
        }
        int i,j,m,n;
        for (i=0;i<s.length();i++) {
            if (i==0) {
                map[i] = 1;
                continue;
            }
            if (check(s,i)) {
                if (i==1) {
                    if (s.charAt(i)=='0') {
                        map[i] = 1;
                    }
                    else {
                        map[i] = 2;
                    }
                }
                else {
                    if (s.charAt(i)=='0') {
                        map[i] = map[i-2];
                    }
                    else {
                        map[i] = map[i-1] + map[i-2];
                    }
                }
            }
            else {
                if (s.charAt(i)=='0') {
                        return 0;
                }
                else {
                    map[i] = map[i-1];
                }
            }
        }
        return map[s.length()-1];
    }
    private boolean check(String s,int i) {
        int m,n;
        m = s.charAt(i) - 48;
        n = s.charAt(i-1) - 48;
        if (n==0) {
            return false;
        }
        if (((n*10+m)<=26)&&((n*10+m)>0)) {
            return true;
        }
        else {
            return false;
        }
    }
}