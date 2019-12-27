class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergeArray = new int [nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
 
        for(int i=0;i< nums1.length + nums2.length;i++) {
            if(nums1.length > index1 && nums2.length > index2) {
                mergeArray[i] = (nums1[index1] < nums2[index2])?nums1[index1++]:nums2[index2++];
            }
            else if(nums1.length > index1) {
                mergeArray[i] = nums1[index1++];
            }
            else {
                mergeArray[i] = nums2[index2++];
            }
        }
        if(mergeArray.length % 2 == 1) 
            return  mergeArray[(mergeArray.length -1) /2];
        else {
            return (mergeArray[mergeArray.length/2 -1] + mergeArray[mergeArray.length/2]) / 2.0;
        }
    }
}
