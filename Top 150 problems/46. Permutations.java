class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(new HashSet<Integer>(),nums,new ArrayList<Integer>());
        return  list;
    }
    public void backtrack(HashSet<Integer> set,int[] nums,ArrayList<Integer> l)
    {
        if(set.size()==nums.length)
        {
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))continue;
            set.add(nums[i]);
            l.add(nums[i]);
            backtrack(set,nums,l);
            set.remove(nums[i]);
            l.remove(l.size()-1);
        }
    }
}