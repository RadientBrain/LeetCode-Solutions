class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            int i=0, rem=0;
            while(num>0){
                i+=1;
                num=num/10;
            }
            // another method to find i = log10(num) + 1
            if(i%2==0)count+=1;
        }
        return count;
    }
}
