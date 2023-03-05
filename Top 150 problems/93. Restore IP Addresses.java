class Solution {
    List<String> list=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(0,s,"",0);
        return list;
    }
    public void backtrack(int start,String s,String arr,int dots)
    {
        if(dots==3)
        {
            if(isValid(s.substring(start)))
            {
                arr+=s.substring(start);
                list.add(arr);
            }    
            return;     
        }
        for(int i=start;i<s.length();i++)
        {
            if(isValid(s.substring(start,i+1)))
            {
                int k=s.substring(start,i+1).length();
                arr+=s.substring(start,i+1)+".";
                backtrack(i+1,s,arr,dots+1);
                arr=arr.substring(0,arr.length()-k-1);
            }
        }
    }
    public boolean isValid(String s)
    {
        if(s.length()>3 || s.length()==0)return false;
        if(s.length()>1 && s.charAt(0)=='0')return false;
        if(s.length()>0 && Integer.parseInt(s)>255)return false;
        return true;

    }
}