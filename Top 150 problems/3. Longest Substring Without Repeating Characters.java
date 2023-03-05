class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)return s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int j=0;
        int i=0;
        int prev=0;
        while(j<s.length())
        {
            if(!map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),j);
                if(j==s.length()-1)
                {
                  max=Math.max(max,map.size());
                }
            }
            else
            {
                max=Math.max(max,map.size());
                i=map.get(s.charAt(j))+1;
                for(int ind=prev;ind<i;ind++)
                {
                    if(map.containsKey(s.charAt(ind)))
                    {
                        map.remove(s.charAt(ind));
                    }
                }
                map.put(s.charAt(j),j);
                prev=i;
            }
            j++;
        }
        return max;
    }
}