class Solution {
    public int repeatedStringMatch(String a, String b) {
        int counter = 1;
        String string = a;
        for (int i = 0; i < (b.length()/a.length()) + 2; i++) {
            if (string.contains(b)) return counter;
            else {
                string += a;
                counter++;
            }
        }
        return -1;   
    }
}
