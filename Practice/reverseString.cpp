class Solution {
public:
    void reverseString(vector<char>& s) {
        int start,end;
        start = 0 ;
        end = s.size()-1;
        while(start<=end){
            // cout<<end<<" ";
            // cout<<start;
            swap(s[start],s[end]);
            start++;
            end--;
        }
    }
};
