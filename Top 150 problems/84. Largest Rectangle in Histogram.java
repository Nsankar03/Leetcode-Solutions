class Solution {
     
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
           if(stack.isEmpty())
           {
               left[i]=0;
           }
            else
            {
                while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    left[i]=0;
                }
                else
                {
                    left[i]=stack.peek()+1;
                }
                
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            stack.pop();
        }
        for(int i=nums.length-1;i>=0;i--)
        {
           if(stack.isEmpty())
           {
               right[i]=nums.length-1;
           }
            else
            {
                while(!stack.isEmpty() && nums[stack.peek()]>=nums[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    right[i]=nums.length-1;
                }
                else
                {
                    right[i]=stack.peek()-1;
                }
                
            }
             stack.push(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int area=(right[i]-left[i]+1)*nums[i];
            if(area>max)
            {
                max=area;
            }
        }
        return max;
    }
}