class Solution {
    public String reverseWords(String s) {
        String[] strArray = s.split(" ");

        List<String> list = new ArrayList<String>();

        int i = 0;
        while(i < strArray.length) {
            if (!strArray[i].isEmpty()) {
                list.add(strArray[i]);
            }
            i++;
        }

        StringBuilder strBuilder = new StringBuilder();

        for (int j = list.size()-1 ; j >=0 ; j--) {

            strBuilder.append(list.get(j)+" ");
        }

        return strBuilder.toString().trim();
    }
}
