class Solution {
    public String toLowerCase(String s) {
        // String str = s.toLowerCase();
        // return str;


        StringBuilder lowercase = new StringBuilder();
        for(char c : s.toCharArray())
        {
            if(c >= 'A' && c <= 'Z')
            {
                lowercase.append((char)(c + 32));
            }
            else
            {
                lowercase.append(c);
            }
        }
        return lowercase.toString();
    }
}