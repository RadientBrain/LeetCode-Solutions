class Solution {
    // s1 = nk + x  <-- s1%k
    // s2 = mk + x  <-- s2%k
    // s1-s2 = k(n-m) -> multiple of k
    //
    // For negative remainder
    // example = kn - 3 = kn - 3 +k -k = k(n-7) + (k-3)
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int rem = 0;
        mp.put(0,-1);
        for(int i =0;i<nums.length;i++){
            rem += nums[i];
            
            if(k!=0) rem%=k;
            
            if(mp.containsKey(rem)){
                if(i - mp.get(rem)>1) return true;
            }else{
                mp.put(rem,i);
            }
        }
        return false;
    }
}
