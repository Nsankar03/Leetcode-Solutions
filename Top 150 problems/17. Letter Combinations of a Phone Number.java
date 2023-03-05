class Solution {
    List<String> list=new ArrayList<>();
    String arr[]=new String[10];
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return list;
        arr[0]="";arr[1]="";arr[2]="abc";arr[3]="def";arr[4]="ghi";arr[5]="jkl";arr[6]="mno";arr[7]="pqrs";arr[8]="tuv";arr[9]="wxyz";
        backtrack(0,digits,"");
        return list;
    }
    public void backtrack(int ind,String digits,String s)
    {
        if(s.length()==digits.length())
        {
            list.add(s);
            return;
        }
        for(int i=0;i<arr[digits.charAt(ind)-'0'].length();i++)
        {
            s+=arr[digits.charAt(ind)-'0'].charAt(i);
            backtrack(ind+1,digits,s);
            s=s.substring(0,s.length()-1);
        }
    }
}
/* s+=arr[digits.charAt(ind)-'0'].charAt(i);
            backtrack(ind+1,digits,s);
            s=s.substring(0,s.length()-1);