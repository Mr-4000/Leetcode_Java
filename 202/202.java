class Solution {
    public boolean isHappy(int n) {
        List<Integer> l = new ArrayList<Integer>();
        int i;
        if (n==1){
                return true;
        }
        while (1==1){
            l.add(n);
            i = 0;
            while (n!=0){
                i = i + (n%10)*(n%10);
                n = n / 10;
            }
            if (l.contains(i)){
                return false;
            }
            if (i==1){
                return true;
            }
            n = i;
        }
    }
}