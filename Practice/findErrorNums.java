class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        int[] arr = {0,0};
        for(i=0;i<nums.length;i++){
            if(i != nums[i]-1){
                arr[0] = nums[i];
                arr[1] = i+1;
                break;
            }
        }
        
        return arr;
    }
    
    void swap(int[] nums, int first, int second){
        int temp=0;
        temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
