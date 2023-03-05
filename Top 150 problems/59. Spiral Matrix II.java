class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int top=0;
        int down=n-1;
        int left=0;
        int right=n-1;
        int max=(n*n)+1;
        int count=1;
        while(count<=max)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=count++;
                if(count==max)return arr;
            }
            top++;
            for(int i=top;i<=down;i++)
            {
                arr[i][right]=count++;
                if(count==max)return arr;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                arr[down][i]=count++;
                if(count==max)return arr;
            }
            down--;
            for(int i=down;i>=top;i--)
            {
                arr[i][left]=count++;
                if(count==max)return arr;
            }
            left++;
        }
        return arr;
    }
}