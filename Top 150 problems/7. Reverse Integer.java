class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0)
        {
            flag=1;
            x*=-1;
        }
        int sum=0;
        while(x>0)
        {
            sum=(sum*10)+x%10;
            x/=10;
        }
        if(flag==1)
        {
           sum*=-1;
        }
        if((sum>2147483647) || (sum<(-2147483648)))
        {
            return 0;
        }
        
        return sum;
    }
}