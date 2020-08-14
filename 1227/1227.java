class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if (n==1) {
            return 1;
        }
        return 0.5;
        //第k个人坐完之后，座位k一定有人，所以当n去坐的时候，只有1，n两个座位能选；
    }
}