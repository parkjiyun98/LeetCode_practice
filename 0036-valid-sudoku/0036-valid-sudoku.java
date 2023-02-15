class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0; i<board.length ; i++){
            set = new HashSet<>();
            for(int j =0; j<board[i].length ; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }
    
        for(int i =0; i<board.length ; i++){
            set = new HashSet<>();
            for(int j =0; j<board[i].length ; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i])) return false;
                    set.add(board[j][i]);
                }
            }
        }
        
        for(int i =0; i<board.length ; i = i+3){
            for(int j =0; j<board[i].length ; j = j+3){
                set = new HashSet<>();
                for(int x = i; x<i+3 ; x++ ){
                    for(int y = j; y<j+3 ; y++){
                        if(board[x][y] != '.'){
                            if(set.contains(board[x][y]))
                                return false;
                            set.add(board[x][y]);
                        }
                    }
                }
            } 
        }
        
        
        return true;
        
    }
}