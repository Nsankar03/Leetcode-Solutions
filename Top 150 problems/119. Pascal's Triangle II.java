class Solution {
    public List<Integer> getRow(int rowIndex) {
          List<List<Integer>> pascal=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> list=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                   list.add(1);
                }
                else if(i==j)
                {
                    list.add(1);
                }
                else
                {
                    list.add((pascal.get(i-1).get(j-1))+(pascal.get(i-1).get(j)));
                }
                
            }
            pascal.add(list);
            
        }
        return pascal.get(rowIndex);
    }
}
