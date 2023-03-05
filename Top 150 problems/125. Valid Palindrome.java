class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                if(Character.isUpperCase(s.charAt(i)))
                {
                    str+=(Character.toLowerCase(s.charAt(i)));
                }
                else
                {
                    str+=s.charAt(i);
                }
            }
        }
        return isP(str);
    }
    public boolean isP(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}