class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)return mid;
            else if(target>nums[mid])l=mid+1;
            else if(target<nums[mid])r=mid-1;   
        }
        if(nums[mid]<target)return mid+1;
        if(nums[mid]>target)return mid;
        return 0;
    }
}