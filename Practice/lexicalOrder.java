class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        
        
        dfs(0,n);
        return list;
        
    }
    
    void dfs(int start, int num){
        for(int i=0;i<10;i++){
            if(start*10+i > num) return;
            if(start*10+i == 0 ) continue;
            if(start<=num) list.add(start*10+i);
            dfs(start*10+i,num);
        }
        
    }
    
    
}
