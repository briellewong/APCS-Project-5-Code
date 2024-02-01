import java.util.Scanner;
public class Main {
    static final int BOARDX = 7;
    static final int BOARDY = 15;
    public static void main(String[] args) {
        Board b = new Board(BOARDX, BOARDY);
        Piece p1 = new Piece(1,1,b);
        //b.displayAll();
        b.placePiece(p1);
        MegaPiece p2 = new MegaPiece(3,2,b);

        b.placePiece(p2);
        b.displayAll();

/*

        System.out.println("Welcome to MEGA Connect 5!");
        System.out.println("You may choose to place one 3x3 MegaPiece");
        System.out.println();
        Board board = new Board(BOARDX, BOARDY);
        Scanner input = new Scanner(System.in); //creates scanner obj
        int player = 1;
        int[] remainingMegaPiece = new int[2];
        remainingMegaPiece[0] = 1;
        remainingMegaPiece[1] = 1;

        while (true) {
            board.displayAll();
            System.out.println("Player: " + player + ":");

            // Stuff should go here, probably
            if(remainingMegaPiece[0] == 1) {
                System.out.println("Use MegaPiece? (Y/N)?");

                if (input.nextLine() == "Y") {
                    System.out.println("Enter the column you would like to place your MegaPiece at.");
                }
                if (input.nextLine() == "N") {
                        System.out.println("Enter the column you would like to place your Piece at.");
                    }
                    else {
                        System.out.println("Please enter a valid answer.");
                    }
            }
            else {
                System.out.println("Enter the column you would like to place your Piece at.");
            }


            if (board.checkForWin(player)) {
                System.out.println("player: " + player + " has won!");
                board.displayAll();
                break;
            }
            player = player % 2 + 1;
        }

*/

    }
}
