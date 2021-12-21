class Solution {
    public int numSplits(String s) {
        
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];
        int goodWays = 0;

        HashSet<Character> set1 = new HashSet<>();
        for(int i =0;i<s.length();i++){
            set1.add(s.charAt(i));
            prefix[i] = set1.size();
        }

        HashSet<Character> set2 = new HashSet<>();
        for(int i = s.length()-1;i>=0;i--){
            set2.add(s.charAt(i));
            suffix[i] = set2.size();
        }

        for(int i=1;i<s.length();i++){
            if(prefix[i-1] == suffix[i]){
                goodWays++;
            }
        }
        return goodWays;
    }
}
