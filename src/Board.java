public class Board implements BoardInterface {
    
    private Piece[][] brd;
    private Piece lastColour;
    
    public Board() {
        this.brd = null;
        this.lastColour = null;
    }

    public boolean setBoardSize(int sizeX, int sizeY) throws InvalidBoardSizeException,
            BoardAlreadySizedException {
        if (sizeX < 1 || sizeY < 1) {
            throw new InvalidBoardSizeException("Specified size too small.");
        } else if (sizeX > 100 || sizeY > 100) {
        	throw new InvalidBoardSizeException("Specified size too large.");
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
        //Make visual representation if you have the time
        
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
    	if (colour == lastColour) {
    		throw new InvalidColourException("This player has already made a move.");
    	}
    	if ((move.getXPosition() < 0) || (move.getXPosition() >= (brd[0].length)) || (move.getYPosition() < 0) || (move.getYPosition() >= (brd.length))) {
    		throw new InvalidPositionException("The position specified is not on the board.");
    	}
    	if (move.hasConceded()) {
    		return false; //true;
    	}
    	if (brd[move.getYPosition()][move.getXPosition()] != null) {
    		throw new PositionAlreadyTakenException("The space has already been taken.");
    	} else {
    		brd[move.getYPosition()][move.getXPosition()] = colour;
    	}
    	
    	this.lastColour = colour;
    	
    		return true;
    }

    public Piece gameWon() throws NoBoardDefinedException {
    	if (brd == null) {
    		throw new NoBoardDefinedException("The game hasn't even started!");
    	}
    	//Write method to detect if the game has been won
        return null;
    }

}
