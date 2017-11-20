/**
 * Created by wenqingcao on 10/8/17.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == word.charAt(0))
                    if(dfs(board, word, 0, i, j))
                        return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int index, int x, int y){
        if (word.length() == 1)
            return true;
        if (index == word.length())
            return true;
        if (board[x][y] == word.charAt(index)){
            boolean x1= false,x2=false,x3=false,x4=false;
            if (x+1 < board.length)
                x1 = dfs(board, word, index+1, x+1, y);
            if (x-1 > 0)
                x2 = dfs(board, word, index+1, x-1, y);
            if (y+1 < board[0].length)
                x3 = dfs(board, word, index+1, x, y+1);
            if (y-1 > 0)
                x4 =dfs(board, word, index+1, x, y-1);
            return (x1 || x2 || x3 || x4);
        }else{
            return false;
        }

    }
}
