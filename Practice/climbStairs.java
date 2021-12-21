class Solution {
//     // RECURSIVE (Time Exceeded)
//     public int climbStairs(int n) {
//         if(n == 1) return 1;
//         if(n==2) return 2;
        
//         return climbStairs(n-1)+climbStairs(n-2);
//     }
    
    public int climbStairs(int n) {
        
        int[] tableMemo = new int[n+1];
        if(n==1) return 1;
        if(n==2) return 2;
        tableMemo[1] = 1;
        tableMemo[2] = 2;
        for(int i=3;i<=n;i++){
            tableMemo[i] = tableMemo[i-1] + tableMemo[i-2];
        }
        return tableMemo[n];
    }
}
