class Solution {
    public int[] countBits(int n) {
        int[] memo = new int[n+1];
        for(int i=0;i<=n;i++){
            memo[i] = memo[i/2]+i%2;
        }
        return memo;
    }
}
