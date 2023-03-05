class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String s="1";
        s=countAndSay(n-1);
        StringBuilder str=new StringBuilder(s);
        
      }
}