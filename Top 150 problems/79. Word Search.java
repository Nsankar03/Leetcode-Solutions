class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length()>board.length*board[0].length)return false;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                   if(dfs(i,j,board,word,0))return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int r,int c,char[][] board,String word,int ind)
    {
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='*' || board[r][c]!=word.charAt(ind))return false;
        if(ind>=word.length()-1)
        {
            return true;
        }
        char temp=board[r][c];
        board[r][c]='*';
        boolean ans =dfs(r+1,c,board,word,ind+1)||
        dfs(r-1,c,board,word,ind+1)||
        dfs(r,c+1,board,word,ind+1)||
        dfs(r,c-1,board,word,ind+1);
        board[r][c]=temp;
        return ans;

    }
}