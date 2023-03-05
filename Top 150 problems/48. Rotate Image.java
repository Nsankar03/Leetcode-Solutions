class Solution {
    public void rotate(int[][] matrix) {
        int b=0;
        for(int ind=0;ind<matrix.length;ind++)
        {
            for(int i=ind;i<matrix.length;i++)
            {
                int temp=matrix[ind][i];
                matrix[ind][i]=matrix[i][ind];
                matrix[i][ind]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int l=0,r=matrix.length-1;
            while(l<r)
            {
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}