class Solution {
    public int tribonacci(int n) {
        if (n<3) {
            return n==0? 0 : 1;
        }
        if (n==3) {
            return 2;
        }
        return 2*tribonacci(n-1)-tribonacci(n-4);
    }
}