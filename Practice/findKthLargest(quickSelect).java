class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length-1,k);
    }
    
    int quickSelect(int[] nums, int left, int right, int k){
        int pivot = left;
        
        for(int i =left;i<right;i++){
            if(nums[i]<=nums[right]){
                swap(nums,pivot++,i);
            }
        }
        
        swap(nums,pivot,right);
        
        int count = right-pivot+1;
        
        if(count == k){
            return nums[pivot];
        }else if(count>k){
            return quickSelect(nums,pivot,right,k);
        }
        
        return quickSelect(nums,left,pivot-1,k-count);
        
    }
    
    void swap(int[] nums, int first, int second){
        int temp=0;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
