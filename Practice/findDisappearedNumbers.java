class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i=0;
        while(i<nums.length){
            if(nums[i]!= nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for(i=0;i<nums.length;i++){
            if(i!= (nums[i]-1)){
                res.add(i+1);
            }
        }
        //System.out.print(Arrays.toString(nums));
        return res;        
    }
    
    
    void swap(int[] nums, int first, int second){
        int temp=0;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
       
}
