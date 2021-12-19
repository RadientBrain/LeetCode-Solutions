class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,mid=0,right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                mid++;
            }else{
                swap(nums, mid, left);
                mid++;left++;
            }
        }
    }
    
    void swap(int[] nums, int l, int r){
        int temp = 0;
        temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
