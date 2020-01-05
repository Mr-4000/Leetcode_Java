class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m,n,i,l;
        double s;
        m = nums1.length;
        n = nums2.length;
        int[] nums3 = new int[m+n];
        for(i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        for(i=m;i<(m+n);i++){
            nums3[i]=nums2[i-m];
        }
        Arrays.sort(nums3);
        l=(m+n)/2;
        System.out.print(l);
        if ((m+n)%2==0){
            s = (nums3[l-1]+nums3[l])/2d;
        }
        else {
            s = nums3[l];
        }
        return s;
    }
}
/*
执行用时 :
11 ms
, 在所有 Java 提交中击败了
11.65%
的用户
内存消耗 :
46.4 MB
, 在所有 Java 提交中击败了
96.13%
的用户
*/