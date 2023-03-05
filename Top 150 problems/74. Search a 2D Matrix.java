class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=(matrix[0].length*matrix.length)-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target)
            {
                return true;
            }
            else if(target<matrix[mid/matrix[0].length][mid%matrix[0].length])
            {
                r=mid-1;
            }
            else if(target>matrix[mid/matrix[0].length][mid%matrix[0].length])
            {
                l=mid+1;
            }
        }
        return false;
    }
}