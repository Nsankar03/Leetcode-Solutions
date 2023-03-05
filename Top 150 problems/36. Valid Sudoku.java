class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]!='.')
                {
                    if(s.contains(board[i][j]+"r"+i)||s.contains(board[i][j]+"c"+j)||s.contains(board[i][j]+"rc"+i/3+""+j/3))return false;
                    s.add(board[i][j]+"r"+i);
                    s.add(board[i][j]+"c"+j);
                    s.add(board[i][j]+"rc"+i/3+""+j/3);

                }
            }
        }
        return true;
    }
}