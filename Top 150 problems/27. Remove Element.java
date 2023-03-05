class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=0;
                count++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                for(int j=nums.length-1;j>=i+1;j--)
                {
                    if(nums[j]!=0)
                    {
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }   
                }
            }
        }
        return nums.length-count;
    }
}