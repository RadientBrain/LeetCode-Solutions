// x^0 = x
// x^x = 0

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i:nums){
            xor^=i;
        }
        
        return xor;
    }
}
