class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int prev = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(prev==0) {prev=1;count=0;}
                if(prev==1) count++;
                if(max< count) max = count;
            }else prev=0;
        }
        return max;
    }
}
