class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

for(int i=0;i<9;i++){

    for(int j=0;j<9;j++){

        if(board[i][j]=='.')
            continue;

        String row = "R"+i+board[i][j];
        String col = "C"+j+board[i][j];
        String box = "B"+(i/3)+(j/3)+board[i][j];

        if(!set.add(row) ||
   !set.add(col) ||
   !set.add(box)){
    return false;
}
    }
}

return true;
    }
}