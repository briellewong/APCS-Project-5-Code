public class Board {
    // declare instance variables here!
    private int[][] boardPieces;

    public Board(int x, int y) { // constructor!
        boardPieces = new int[x][y];
    }

    public void placePiece(Piece p) { // updates the state of the board with the information of the Piece
        if (p instanceof MegaPiece) {
            // hmm
        } else {
            int column = p.getCol();
            int row = p.getRow();

            boardPieces[row][column] = p.getColor();
        }
    }


    public int[][] getBoardPieces() { // getter function for boardPieces array

        return boardPieces;
    }

    public void displayAll() { // displays the entire board
        System.out.println("   1  2  3  4  5  6  7  8 9 10 11 12 13 14 15 ");
        for (int row = 0; row < boardPieces.length; row++) {
            System.out.print("#  ");
            for (int col = 0; col < boardPieces[0].length; col++) {
                if (boardPieces[row][col] == 0) {
                    System.out.print(".  ");
                }
                if (boardPieces[row][col] == 1) {
                    System.out.print("X  ");
                }
                if (boardPieces[row][col] == 2) {
                    System.out.print("O  ");
                }

            }
            System.out.println("#");


        }
    }
        public boolean checkForWin(int player) { //FIXME
            return false;
        }

    }

