import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuffer res = new StringBuffer();
        Arrays.sort(str);

        if(str == null || str.length == 0) return "";

        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        for(int i=0;i<first.length;i++)
        {
            if(first[i] != last[i])
            {
                break;
            }
            else
            {
                res.append(first[i]);
            }
        }

        return res.toString();
    }
}