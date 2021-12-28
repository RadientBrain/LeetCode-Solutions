class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#' && s1.empty()) continue;
            else if(s.charAt(i) == '#' && !s1.empty()) s1.pop();
            else s1.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#' && s2.empty()) continue;
            else if(t.charAt(i) == '#' && !s2.empty()) s2.pop();
            else s2.push(t.charAt(i));
        }
        
        if(s1.size()!=s2.size()) return false;
        else{
            while(!s1.empty() && !s2.empty()){
                if(s1.pop()!=s2.pop()) return false;
            }
        }
        return true;
    }
}
