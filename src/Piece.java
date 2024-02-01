public class Piece {
    // instance variables go here!
    int row;
    int column;
    int colorVariables;

    public Piece(int col, int color, Board board) { // constructor!
        column = col;
        row = findRow(col, board);
        System.out.println(row);
        colorVariables = color;
    }

    private int findRow(int column, Board board) { // given the state of the board, and a column, it returns the row
        int[][] boardPieces = board.getBoardPieces();
        int result = -1;
        if (this instanceof MegaPiece) {
            for (int row = -1; row < boardPieces.length-1; row++){
                if (boardPieces[row+1][column] != 0 || boardPieces[row+1][column+1] != 0 || boardPieces[row+1][column-1] != 0){
                    return row;
                }
            }
            return boardPieces.length-1;
        } else {
            for (int row = -1; row < boardPieces.length -1; row++) {
                if (boardPieces[row+1][column] != 0){
                    return row;
                }
            }
            return boardPieces.length-1;
        }
        //return result;
    }
    public int getCol() {
        return column;
    } //FIXME
    public int getRow() {
        return row;
    }
    public int getColor() {
        return colorVariables;
    }
}
