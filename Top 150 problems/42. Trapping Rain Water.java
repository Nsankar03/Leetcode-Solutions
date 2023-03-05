class Solution {
    public int trap(int[] nums) {
        int left=0;
        int right=nums.length-1;;
        int l=1;
        int ans=0;
        int r=nums.length-2;
        while(l<=r)
        {
            if(nums[left]<nums[right])
            {
                if(nums[l]>nums[left])
                {
                    left=l;
                    l++;
                }
                else
                {
                    ans+=(nums[left]-nums[l]);
                    l++;
                }
                    
            }
            else
            {
                if(nums[r]>nums[right])
                {
                    right=r;
                    r--;
                }
                else
                {
                    ans+=(nums[right]-nums[r]);
                    r--;
                }
            }
        }
        return ans;
        
    }
}