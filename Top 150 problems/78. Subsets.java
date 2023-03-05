class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList());
        return list;
    }
    public void backtrack(int s,int[] nums,ArrayList<Integer> arr)
    {
        list.add(new ArrayList<>(arr));
        for(int i=s;i<nums.length;i++)
        {
            arr.add(nums[i]);
            backtrack(i+1,nums,arr);
            arr.remove(arr.size()-1);
        }
        return;
    }
}