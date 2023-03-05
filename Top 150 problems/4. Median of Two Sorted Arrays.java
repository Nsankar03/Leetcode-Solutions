class Solution {
     PriorityQueue<Integer> min=new PriorityQueue<>();
     PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        for(int i=0;i<nums1.length;i++)
        {
           add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            add(nums2[i]);
        }
        if(max.size()==min.size())
        {
            return ((float)max.peek()+(float)min.peek())/2f;
        }
        else
        {
            return max.peek();
        }
        
    }
    public void add(int val)
    {
            max.add(val);
            min.add(max.poll());
            if(min.size()>max.size())
            {
                max.add(min.poll());
            }
    }
}