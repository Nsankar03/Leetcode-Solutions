class Solution {
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char chArr[] = strs[i].toCharArray();
            Arrays.sort(chArr);
            String s=new String(chArr);
            if(map.containsKey(s))
            {
                map.get(s).add(strs[i]);
            }
            else
            {
                ArrayList<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(s,l);
            }
        }
        for(String str:map.keySet())
        {
            list.add(map.get(str));
        }
        return list;
    }
}