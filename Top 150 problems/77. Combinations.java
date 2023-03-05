class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new LinkedList<>();
        backtrack(1,n,k,new LinkedList<Integer>(),list);
        return list;
    }
    public void backtrack(int start,int n,int k,LinkedList<Integer> arr,List<List<Integer>> list)
    {
        if(arr.size()==k)
        {
            list.add(new LinkedList<Integer>(arr));
            return;
        }
        for(int i=start;i<=n && arr.size()<k;i++)
        {
            arr.add(i);
            backtrack(i+1,n,k,arr,list);
            arr.removeLast();
        }
    }
}