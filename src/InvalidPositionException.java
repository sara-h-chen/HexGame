import java.lang.Exception;
/**
 * Exception to indicate that the position specified is invalid - e.g. outside of the board such as (-1,-1)
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class InvalidPositionException extends Exception
{
	public InvalidPositionException() {
	}
	
	public InvalidPositionException(String msg) {
		super(msg);
	}
	
	public InvalidPositionException(Throwable cause) {
		super(cause);
	}
	
	public InvalidPositionException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
