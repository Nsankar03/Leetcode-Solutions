class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int i=0,j=0;
        while(j<prices.length)
        {
            if(prices[j]<prices[i])i=j;
            if(prices[j]>prices[i])
            {
                max=Math.max(max,prices[j]-prices[i]);
            }
            j++;
        }
        return max;
    }
}