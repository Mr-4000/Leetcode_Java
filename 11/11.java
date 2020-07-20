class Solution {
    public int maxArea(int[] height) {
        int m=0,n=height.length-1,max=0,h;
        while(m<n){
            h = Math.min(height[m],height[n]);
            if (max<(h*(n-m))){
                max = h*(n-m);
            }
            if (height[m]<height[n]){
                m++;
            }
            else{
                n--;
            }
        }
        return max;
    }
}