class Solution {
     int arr[]=new int[2];
    public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1,ind=-1,l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ind=mid;
                break;
            }
            else if(nums[mid]<target) l=mid+1;
            else if(nums[mid]>target) r=mid-1;
        }
        int i=ind;
        start=ind;
        end=ind;
        while(ind>0 && nums[ind-1]==target)
        {
            start--;
            ind--;
        }
        while(i<nums.length-1 && nums[i+1]==target)
        {
            end++;
            i++;
        }
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
}