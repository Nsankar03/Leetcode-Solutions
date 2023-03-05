class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        if(s.length()==1)return s;
         List<List<Character>> list=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             list.add(new ArrayList<Character>());
         }
         int i=0;
         int k=0;
         while(i<s.length())
         {
             if(i>=s.length()-1)
             {
                 break;
             }
             int j=0;
             if(j==0)
             {
                while(j<n)
                {
                    list.get(j).add(s.charAt(i));
                    j++;
                    if(i<s.length()-1)
                    {
                        i++;
                    }
                    else
                    {
                        break;
                    }
                }
             }
            
             k++;
             if(n==2)
             {
             j=0;
             list.get(0).add(s.charAt(i));
             i++;
             }
             else
             j-=2;
            if(i==s.length()-1)
             {
                 break;
             }
             while(j>0)
             {
                 list.get(j).add(s.charAt(i));
                 if(i<s.length()-1)
                 {
                    i++;
                 }
                 else
                 {
                     break;
                 }
                 j--;
                 k++;
             }
         }
         String str="";
         for(int l=0;l<list.size();l++)
         {
             for(int j=0;j<list.get(l).size();j++)
             {
                 str+=list.get(l).get(j);
             }
         }
         return str;
    }
}