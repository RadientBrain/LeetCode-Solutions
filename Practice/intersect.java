class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first = nums1.length,second = nums2.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int l=0,r=0;
        while(l<first && r<second){
            if(nums1[l] == nums2[r]){
                arr.add(nums1[l]);
                l++;r++;
            }else if(nums1[l]<nums2[r]){
                l++;
            }else{
                r++;
            }
        }
        int [] res = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}
