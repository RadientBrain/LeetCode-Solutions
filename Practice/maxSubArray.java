class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],tempSum=0;
        for(int i: nums){
            tempSum+=i;
            if(tempSum>max){
                max = tempSum;
            }
            if(tempSum<0){
                tempSum=0;
            }
        } 
        
        return max;
    }
}
