class Solution {
    public String addBinary(String a, String b) {
        int l=0;
        if(a.length()>b.length())
        {
            l=a.length();
        }
        else
        {
            l=b.length();
        }
        int arr1[]=new int[l];
        int arr2[]=new int[l];
        int j=l-1;
        int k=l-1;
        for(int i=a.length()-1;i>=0;i--)
        {
            arr1[j--]=a.charAt(i)-'0';
        }
        for(int i=b.length()-1;i>=0;i--)
        {
            arr2[k--]=b.charAt(i)-'0';
        }
        String str="";
        int carry=0;
        for(int i=l-1;i>=0;i--)
        {
            if((carry+arr1[i]+arr2[i])==1)
            {
               str+=1;
                carry=0;
            }
             else if((carry+arr1[i]+arr2[i])==3)
             {
                 str+=1;
                 carry=1;
             }
            else if((carry+arr1[i]+arr2[i])==2)
            {
                str+=0;
                carry=1;
            }
            else
            {
                str+=0;
                carry=0;
            }
        }
        if(carry==1)
        {
            str+=1;
        }
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }
}