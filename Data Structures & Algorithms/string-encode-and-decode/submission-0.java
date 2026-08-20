class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodeString=new StringBuilder();
        for(String str:strs){
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }

    public List<String> decode(String str) {
         List<String> decodeString = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int separate = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, separate));
            i = separate + 1;
            String word = str.substring(i, i + len);
            decodeString.add(word);
            i = i + len;
        }
        return decodeString;

    }
}
