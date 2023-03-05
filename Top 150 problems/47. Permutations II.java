class Solution {
    Set<List<Integer>> list=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums,new ArrayList<>(),new HashSet<Integer>());
        return new ArrayList<>(list);
    }
    public void backtrack(int[] nums,ArrayList<Integer> l,HashSet<Integer> set)
    {
        if(set.size()==nums.length)
        {
            list.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(i))continue;
            l.add(nums[i]);
            set.add(i);
            backtrack(nums,l,set);
            l.remove(l.size()-1);
            set.remove(i);
        }

        
    }
}