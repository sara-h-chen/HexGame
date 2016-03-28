import java.util.Arrays;

public class Board implements BoardInterface {
    
    private Piece[][] brd;
    
    public Board() {
        this.brd = null;
    }

    public boolean setBoardSize(int sizeX, int sizeY) throws InvalidBoardSizeException,
            BoardAlreadySizedException {
        if (sizeX < 1 || sizeY < 1) {
            throw new InvalidBoardSizeException("Specified size too small.");
        }
        if (brd != null) {
            throw new BoardAlreadySizedException("Board already exists.");
        }
        this.brd = new Piece[sizeY][sizeX];
        return true;
    }

    public Piece[][] getBoardView() throws NoBoardDefinedException {
        if (brd == null) {
            throw new NoBoardDefinedException("Board has not been set!");
        }
        //Make visual representation
        
        /* Defensive copying of the board */
        Piece[][] defBoard = new Piece[brd.length][(brd[0]).length];
        for (int i=0; i < (brd).length; i++) {
            for (int j=0; j < brd[0].length; j++) {
                defBoard[i][j] = brd[i][j];
            }
        }
        /* Test & Debug
        for (int x=0; x < defBoard.length; x++) {
            System.out.println(Arrays.toString(defBoard[x]));
        }
        */
        return defBoard;
    }

    public boolean placePiece(Piece colour, MoveInterface move)
                    throws PositionAlreadyTakenException,
                    InvalidPositionException,
                    InvalidColourException {
        return false;
    }

    public Piece gameWon() throws NoBoardDefinedException {
        return null;
    }

}
