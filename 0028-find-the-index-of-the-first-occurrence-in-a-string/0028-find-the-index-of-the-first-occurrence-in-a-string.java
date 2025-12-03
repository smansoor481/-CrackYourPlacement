class Solution {
    public int strStr(String str, String subStr) {
        str = str.toLowerCase();
        subStr = subStr.toLowerCase();

        if(str.contains(subStr))
        {
            return str.indexOf(subStr);
        }
        return -1;
    }
}