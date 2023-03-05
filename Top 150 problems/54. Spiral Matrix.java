class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        int t=0;
        int d=matrix.length-1;
        int l=0;
        int r=matrix[0].length-1;
        int max=(matrix.length*matrix[0].length);
        while(list.size()<max)
        {
            for(int i=l;i<=r;i++)
            {
                list.add(matrix[t][i]);
                if(list.size()==max)return list;
            }
            t++;
            for(int i=t;i<=d;i++)
            {
                list.add(matrix[i][r]);
                if(list.size()==max)return list;
            }
            r--;
            for(int i=r;i>=l;i--)
            {
                list.add(matrix[d][i]);
                if(list.size()==max)return list;
            }
            d--;
            for(int i=d;i>=t;i--)
            {
                list.add(matrix[i][l]);
                if(list.size()==max)return list;
            }
            l++;
        }
        return list;
    }
}