class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> res = new ArrayList<>();
        String prev = "";

        for(String curr : folder)
        {
            if(prev.isEmpty() || !curr.startsWith(prev+"/"))
            {
                res.add(curr);
                prev = curr;
            }
        }

        return res;
    }
}