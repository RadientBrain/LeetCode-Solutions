class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i: nums1){
            set.add(i);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
                set.remove(i);
            }
        }
        
        int [] re = new int[res.size()];
        
        for(int i=0;i<res.size();i++){
            re[i] = res.get(i);
        }
        
        return re;
        
    }
}
