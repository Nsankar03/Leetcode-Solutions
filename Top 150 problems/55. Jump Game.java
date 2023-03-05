class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            if(r>=nums.length-1)return true;
            if(nums[r]==0)return false;
            r=Math.max(r,(nums[i]+i));
        } 
        return false;
    }
}