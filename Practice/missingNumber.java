class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!= nums[nums[i]]){
                swap(nums, i, nums[i]);
            }else{
                i++;
            }
        }
        i=0;
        while(i<nums.length){
            if(i==nums[i]){
                i++;
            }else{
                return i;
            }
        }
        return nums.length;        
    }
    
    void swap(int[] nums, int first, int second){
        int temp=0;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
       
}
