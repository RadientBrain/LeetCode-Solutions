class Solution {
    // start by filling from last of array
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1 = m-1;
        int n2 = n-1;
        int res = m+n-1;
        
        while(n1>=0 && n2>=0){
            if(nums1[n1] < nums2[n2]){
                nums1[res] = nums2[n2];
                res--;n2--;
            }else{
                nums1[res] = nums1[n1];
                res--;n1--;
            }
        }
        
        while(n2>=0){
            nums1[res] = nums2[n2];
            res--;n2--;
        }
        
    }
}
