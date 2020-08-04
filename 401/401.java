class Solution {
    public List<String> readBinaryWatch(int num) {
        int i,j;
        List<String> ans = new ArrayList();
        for (i=0;i<12;i++) {
            for (j=0;j<60;j++) {
                if (count(i,j) == num) {
                    StringBuilder sb = new StringBuilder();
                    if (j<10) {
                        sb.append(i);
                        sb.append(":0");
                        sb.append(j);
                        ans.add(sb.toString());
                    }
                    else {
                        sb.append(i);
                        sb.append(":");
                        sb.append(j);
                        ans.add(sb.toString());
                    }
                }
            }
        }
        return ans;
    }

    private int count(int i,int j) {
        int res=0;
        while (i!=0) {
            i = i & (i-1);
            res++;
        }
        while (j!=0) {
            j = j & (j-1);
            res++;
        }
        return res;
    }
}