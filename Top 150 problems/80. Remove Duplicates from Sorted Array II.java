class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>2)
            {
                remove(nums,i);
                i--;
                if(nums[i]==100000)break;
            }
        }
         //System.out.print(Arrays.toString(nums)+" "+k);
         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]!=100000)k++;
         }
        return k;
    }
    public void remove(int[] nums,int ind)
    {
        nums[ind]=100000;
        for(int i=ind;i<nums.length-1;i++)
        {
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
       
    }
}