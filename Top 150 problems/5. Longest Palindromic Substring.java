class Solution {
    int max=Integer.MIN_VALUE;
    String ans;
    public String longestPalindrome(String s) {
        backtrack(0,s,"");
        return ans;
    }
    public void backtrack(int start,String s,String str)
    {
        System.out.println(str);
        if(isPalindrome(str))
        {
            if(str.length()>max)
            {
                ans=str;
                max=str.length();
            }
        }
        for(int i=start;i<s.length();i++)
        {
            str+=s.charAt(i);
            backtrack(i+1,s,str);
            str=str.substring(0,str.length()-1);
        }
    }
    public boolean isPalindrome(String str)
    {
        int l=0,r=str.length()-1;
        while(l<=r)
        {
            if(str.charAt(l)!=str.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}