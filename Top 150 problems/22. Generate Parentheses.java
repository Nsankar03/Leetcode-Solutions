class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n,0,0,"");
        return list;
    }
    public void backtrack(int n,int open,int close,String s)
    {
        if(open==n && close==n)
        {
            list.add(s);
            return;
        }
        if(open==close && open<n)
        {
            backtrack(n,open+1,close,s+'(');
        }
        else if(open>close)
        {
            if(close<n)
            backtrack(n,open,close+1,s+')');
            if(open<n)
            backtrack(n,open+1,close,s+'(');
        }
    }
}