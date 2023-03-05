class Solution {
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> partition(String s) { 
        backtrack(0,s,new ArrayList<String>());
        return list;
    }
    public void backtrack(int start,String s,ArrayList<String> arr)
    {
        if(start>=s.length())
        {
            list.add(new ArrayList(arr));
            return;
        }
        for(int i=start;i<s.length();i++)
        {
            if(isPalindrome(s.substring(start,i+1)))
            {
                arr.add(s.substring(start,i+1));
                backtrack(i+1,s,arr);
                arr.remove(arr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}