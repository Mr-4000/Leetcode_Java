class Solution {
    public int strStr(String haystack, String needle) {
        if (needle==""){
            return 0;
        }
        int i,l;
        l = needle.length();
        for(i=0;i<=haystack.length()-l;i++){
            //System.out.println(haystack.substring(i,i+l));
            if (haystack.substring(i,i+l).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}