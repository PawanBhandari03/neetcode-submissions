class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9 ; i++){
            HashSet <Character> set = new HashSet<>();
            for(int j = 0; j< 9 ; j++){
                char current = board[i][j];

                if(current == '.'){
                    continue;
                }
                if(set.contains(current)){
                    return false;
                }
            set.add(current);
            }
        }

    for (int i = 0; i < 9; i++) {

    HashSet<Character> set = new HashSet<>();

    for (int j = 0; j < 9; j++) {

        char current = board[j][i];

        if (current == '.') {
            continue;
        }

        if (set.contains(current)) {
            return false;
        }

        set.add(current);
    }
}

    for(int row = 0; row < 9; row+=3){
        for(int cols = 0; cols < 9; cols+=3){
                HashSet<Character> set = new HashSet<>();

                for(int i=0 ; i<3 ;i++){
                    for(int j=0 ; j<3 ; j++){
                        char current = board[row+i][cols+j];
                        if (current == '.') {
                            continue;
                        }

                        if (set.contains(current)) {
                            return false;
                        }

                        set.add(current);
                    }
                } 
            }
        }
        return true;
    }
}
