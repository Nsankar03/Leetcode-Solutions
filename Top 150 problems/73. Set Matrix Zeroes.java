class Solution {
    public void setZeroes(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int row=0;row<R;row++)
        {
            for(int col=0;col<C;col++)
            {
                if(matrix[row][col]==0)
                {
                    for(int i=0;i<C;i++)
                    {
                        if(matrix[row][i]!=0)
                        matrix[row][i]=42949672;
                    }
                    for(int j=0;j<R;j++)
                    {
                        if(matrix[j][col]!=0)
                        matrix[j][col]=42949672;
                    }
                }
            }
        }
        for(int row=0;row<R;row++)
        {
            for(int col=0;col<C;col++)
            {
                if(matrix[row][col]==42949672)
                {
                    matrix[row][col]=0;
                }
            }
        }
    }
}