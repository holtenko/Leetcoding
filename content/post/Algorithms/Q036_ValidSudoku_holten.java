/**
* Created by holten on 2016-07-08.
* Email: holten.ko@gmail.com
*/

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row=new int[9];
        int[] col=new int[9];
        int[] subbox=new int[9];
        int temp=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                   temp=1<<(board[i][j]-'0');
                   if((row[i]&temp)>0||(col[j]&temp)>0||(subbox[(i/3)*3+j/3]&temp)>0) return false;
                   row[i]|=temp;
                   col[j]|=temp;
                   subbox[(i/3)*3+j/3]|=temp;
                }
            }
        }
        return true;
    }
}