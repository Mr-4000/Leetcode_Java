class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,l=0,p,k;
        while((l<n)&&(i<m+n)){
            if ((i-l)>=m){
                for(p=i;p<(m+n);p++){
                    nums1[p]=nums2[l];
                    l++;
                }
                break;
            }
            if(nums1[i]<nums2[l]){
                i++;
            }
            else{
                for(p=m+n-1;p>i;p--){
                    nums1[p]=nums1[p-1];
                }
                nums1[i]=nums2[l];
                l++;
                i++;
            }
        }
    }
}