import java.lang.Exception;
/**
 * Exception to indicate that it is not possible to make a move. E.g. all cells on the board are already
 * occupied.
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class NoValidMovesException extends Exception
{
	public NoValidMovesException() {
	}
	
	public NoValidMovesException(String msg) {
		super(msg);
	}
	
	public NoValidMovesException(Throwable cause) {
		super(cause);
	}
	
	public NoValidMovesException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
