class Solution {
    public String reverseWords(String str) {
        if(str.equals(null) || str.equals(""))
            return str;


        String res = "";
        int i=0;
        while(i < str.length())
        {
            while(i<str.length() && str.charAt(i) == ' ')
            {
                i++;
            }
            String w="";
            while(i<str.length() && str.charAt(i) != ' ')
            {   
                w = w + str.charAt(i);
                i++;
            }

            if(!w.equals(""))
            {
                res = w + " "+ res;
            }
        }

        if(res.isEmpty())
        {
            return "";
        }

        return res.substring(0, res.length()-1);
    }
}