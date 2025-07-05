class Solution {
    public String mergeAlternately(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int min = Math.min(len1,len2);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<min;i++)
        {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }

        if(len1 > len2)
        {
            sb.append(str1.substring(min));
        }
        if(len1 < len2)
        {
            sb.append(str2.substring(min));
        }

        return sb.toString();
    }
}