package Bactracking;

public class WordSearch {

    public static void main(String[] args)
    {

        String [][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String word="ABCCED";
        boolean str= backTrack(0,0,board,0, word);
        System.out.println(str);

    }
    public static boolean backTrack(int x,int y,String[][] board,int i,String word)
    {
        if(i==word.length()-1) return true;
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || !board[x][y].equals(String.valueOf(word.charAt(i))))
        {
            return false;
        }
        return backTrack(x+1,y,board,i+1,word) &&
        backTrack(x+1,y,board,i+1,word) &&
        backTrack(x+1,y,board,i+1,word) &&
        backTrack(x+1,y,board,i+1,word);

}

}
