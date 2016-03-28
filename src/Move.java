
public class Move implements MoveInterface {

	private int posx;
	private int posy;
	private boolean concede;
	
	public Move() {
		this.posx = 0;
		this.posy = 0;
		this.concede = false;
	}

	public boolean setPosition(int x, int y) throws InvalidPositionException {
		if (x < 0 || y < 0 ) {//(x > board.getSize() || y > board.getSize()) {
			throw new InvalidPositionException("Error: The position specified is not allowed.");
		}
		this.posx = x;
		this.posy = y;
		return true;
	}
	
	public int getXPosition() {
		return posx;
	}
	
	public int getYPosition() {
		return posy;
	}
	
	public boolean hasConceded() {
		if (concede) {
			return true;
		}
		return false;
	}
	
	public boolean setConceded() {
		this.concede = true;
		return concede;
	}
	
}
