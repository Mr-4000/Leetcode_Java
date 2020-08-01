class Solution {
    public boolean isUnique(String astr) {
        int i,j,check=0,move,mark;
        for (i=0;i<astr.length();i++) {
            j = astr.charAt(i);
            move = j - 97;
            mark = 1 << move;
            if ((mark & check)!=0) {
                return false;
            }
            else {
                check = check | mark;
            }
        }
        return true;
    }
}