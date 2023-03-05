class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int m=Math.min(height[left],height[right]);
            if((right-left)*m>max)
            {
                max=(right-left)*m;
            }
             if(height[right]>height[left])
            {
                left++;
            }
            else
            {
                right--;
            }
    
        }
        return max;
    }
}