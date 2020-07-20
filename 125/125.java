class Solution {
    public boolean isPalindrome(String s) {
        if (s.equals("")){
            return true;
        }
        s = s.toLowerCase();
        int i=0,j=s.length()-1;
        while(!pd(s.charAt(i))){
            i++;
            if (i>=j){
                return true;
            }
        }
        while(!pd(s.charAt(j))){
            j--;
        }
        while(i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                while(!pd(s.charAt(i))){
                    i++;
                }
                j--;
                while(!pd(s.charAt(j))){
                    j--;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    private boolean pd(char s){
        int i=s;
        if ((i>=48)&&(i<=57)){
            return true;
        }
        if ((i>=65)&&(i<=90)){
            return true;
        }
        if ((i>=97)&&(i<=122)){
            return true;
        }
        return false;
    }
}