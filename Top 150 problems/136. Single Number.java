class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.contains(nums[i]))
            {
                hash.remove(nums[i]);
            }
            else
            {
                hash.add(nums[i]);
            }
        }
        int n=0;
       for (int i : hash)
       {
            n=i;
            break;
       }     
         
        return n;
    }
}