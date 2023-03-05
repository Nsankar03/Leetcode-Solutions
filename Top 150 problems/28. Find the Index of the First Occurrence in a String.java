class Solution {
    public int strStr(String h, String n) {
        int l=n.length();
        for(int i=0;i<h.length();i++)
        {
            if(h.charAt(i)==n.charAt(0))
            {
                if(i+l<=h.length())
                {
                    if(h.substring(i,i+l).equals(n))
                    {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}