class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] calendar = new int[366];
        int i,j;
        for (i=0;i<days.length;i++) {
            calendar[days[i]] = -1;
        }
        for (i=days[0];i<=days[days.length-1];i++) {
            if (i<7) {
                if (calendar[i]==-1) {
                    calendar[i] = Math.min(calendar[i-1]+costs[0],costs[1]);
                    calendar[i] = Math.min(calendar[i],costs[2]);
                }
                else {
                    calendar[i] = calendar[i-1];
                }
            }
            else {
                if (i<30) {
                    if (calendar[i]==-1) {
                        calendar[i] = Math.min(calendar[i-1]+costs[0],calendar[i-7]+costs[1]);
                        calendar[i] = Math.min(calendar[i],costs[2]);
                    }
                    else {
                        calendar[i] = calendar[i-1];
                    }
                }
                else {
                    if (calendar[i]==-1) {
                        calendar[i] = Math.min(calendar[i-1]+costs[0],calendar[i-7]+costs[1]);
                        calendar[i] = Math.min(calendar[i],calendar[i-30]+costs[2]);
                    }
                    else {
                        calendar[i] = calendar[i-1];
                    }
                }
            }
        }
        return calendar[days[days.length-1]];
    }
}