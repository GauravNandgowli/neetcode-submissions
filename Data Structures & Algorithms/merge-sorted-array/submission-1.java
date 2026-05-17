class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int mid = m - 1;
        int rightEnd = n-1;
        while(mid >= 0 && rightEnd >= 0){
            if(nums1[mid] > nums2[rightEnd]){
                nums1[end] = nums1[mid];
                end--;
                mid--;
            }else{
                nums1[end] = nums2[rightEnd];
                end--;
                rightEnd--;
            }
        }
        while(rightEnd>=0){
            nums1[end] = nums2[rightEnd];
            end--;
            rightEnd--;
        }
        
    }
}