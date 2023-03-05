class Solution {
    public String multiply(String num1, String num2) {
        long n1=0,n2=0;
        String str="";
        for(int i=0;i<num1.length();i++)
        {
            n1=(n1*10)+(num1.charAt(i)-'0');
        }
        for(int i=0;i<num2.length();i++)
        {
            n2=(n2*10)+(num2.charAt(i)-'0');
        }
        long ans=n1*n2;
        if(ans==0)return "0";
        char ch[]=new char[50];
        int k=0;
        while(ans>0)
        {
            ch[k++]=(char)((ans%10)+'0');
            ans/=10;
        }
        for(int i=k-1;i>=0;i--)
        {
            str+=ch[i];
        }
        //System.out.print(str);
        return str;
    }
}