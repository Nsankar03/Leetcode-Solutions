class Solution {
    public int jump(int[] nums) {
        int count=0;
        int l=0,r=0;
        while(r<nums.length-1)
        {
            int max=0;
            for(int j=l;j<r+1;j++)
            {
                max=Math.max(max,nums[j]+j);
            }
            l=r+1;
            r=max;
            count++;
        }
        return count;
         
    }
}