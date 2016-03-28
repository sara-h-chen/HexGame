import java.lang.Exception;
/**
 * Exception to indicate that the selected colour is invalid in this context. E.g. trying to place a piece 
 * of colour UNSET.
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class InvalidColourException extends Exception
{
	public InvalidColourException() {
	}
	
	public InvalidColourException(String msg) {
		super(msg);
	}
	
	public InvalidColourException(Throwable cause) {
		super(cause);
	}
	
	public InvalidColourException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
