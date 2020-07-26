class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] map = new boolean[s.length()];
        int i,j;
        for (i=0;i<s.length();i++) {
            if (wordDict.contains(s.substring(0,i+1))) {
                map[i] = true;
            }
            else {
                for (j=0;j<=i;j++) {
                    if (map[j]!=true) {
                        continue;
                    }
                    else {
                        if (wordDict.contains(s.substring(j+1,i+1))) {
                            map[i] = true;
                        }
                    }
                }
            }
        }
        return map[s.length()-1];
    }
}