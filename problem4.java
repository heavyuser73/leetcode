class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result = new int [nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
 
        for(int i=0;i< nums1.length + nums2.length;i++) {
            

            if(nums1.length > index1 && nums2.length > index2) {
                int min=0;
                if(nums1[index1] < nums2[index2]) {
                    min = nums1[index1];
                    index1++;
                }
                else {
                    min = nums2[index2];
                    index2++;
                }
                result[i] = min;
            }
            else if(nums1.length > index1) {
                result[i] = nums1[index1];
                index1++;
            }
            else {
                result[i] = nums2[index2];
                index2++;
            }
        }
        if(result.length % 2 == 1) 
            return  result[(result.length -1) /2];
        else {
            return (result[result.length/2 -1] + result[result.length/2]) / 2.0;
        }
    }
}
