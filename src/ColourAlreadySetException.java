import java.lang.Exception;
/**
 * Exception to indicate that a color has already been allocated to a player
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class ColourAlreadySetException extends Exception
{
	public ColourAlreadySetException() {
	}
	
	public ColourAlreadySetException(String msg) {
		super(msg);
	}
	
	public ColourAlreadySetException(Throwable cause) {
		super(cause);
	}
	
	public ColourAlreadySetException(String msg, Throwable cause) {
		super(msg, cause);
	}	
}