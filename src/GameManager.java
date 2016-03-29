import java.util.*;

public class GameManager implements GameManagerInterface {

	private HashMap<PlayerInterface, Piece> playerColours; 
	private Board gameBoard; 
	
	//Constructor
	public GameManager() {
		this.gameBoard = new Board();
		this.playerColours = new HashMap<PlayerInterface, Piece>();
	}
	
	public boolean specifyPlayer(PlayerInterface player,
			Piece colour) throws InvalidColourException,
					ColourAlreadySetException {
		if (playerColours.containsKey(player)) {
			throw new ColourAlreadySetException("This player already has a colour.");
		}
		if (playerColours.containsValue(colour)) {
			throw new ColourAlreadySetException("This colour is already assigned to one of the players");
		}
		for (Piece thing: Piece.values()) {
			if (colour.equals(thing)) {
				playerColours.putIfAbsent(player, colour);
				return true;
			}
		}
		throw new InvalidColourException("This is not a rainbow-coloured board!");
	}

	public boolean boardSize(int sizeX, int sizeY)
			throws InvalidBoardSizeException,
			BoardAlreadySizedException {
		gameBoard.setBoardSize(sizeX, sizeY);
		return true;
	}

	public boolean playGame() {
		//TODO with the GUI
		return false;
	}

}
