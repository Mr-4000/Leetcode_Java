class Solution {
    public List<String> restoreIpAddresses(String s) {
        int i,j,k;
        List<String> ans = new ArrayList();
        if (s.length()>12) {
            return ans;
        }
        for(i=0;i<s.length()-3;i++) {
            for (j=i+1;j<s.length()-2;j++) {
                for (k=j+1;k<s.length()-1;k++) {
                    if (check(s,i,j,k)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(s.substring(0,i+1));
                        sb.append(".");
                        sb.append(s.substring(i+1,j+1));
                        sb.append(".");
                        sb.append(s.substring(j+1,k+1));
                        sb.append(".");
                        sb.append(s.substring(k+1,s.length()));
                        ans.add(sb.toString());
                    }
                }
            }
        }
        return ans;    
    }

    private boolean check(String s,int i,int j,int k) {
        String s1=s.substring(0,i+1);
        String s2=s.substring(i+1,j+1);
        String s3=s.substring(j+1,k+1);
        String s4=s.substring(k+1,s.length());
        if ((check0(s1))||(check0(s2))||(check0(s3))||(check0(s4))) {
            return false;
        }
        if ((checknum(s1))&&(checknum(s2))&&(checknum(s3))&&(checknum(s4))) {
            return true;
        }
        return false;
    }

    private boolean check0(String s) {
        if ((s.charAt(0)=='0')&&(s.length()!=1)) {
            return true;
        }
        return false;
    }

    private boolean checknum(String s) {
        int i=Integer.valueOf(s);
        if ((i>=0)&&(i<=255)) {
            return true;
        }
        return false;
    }
}