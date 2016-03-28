import java.lang.Exception;
/**
 * Exception to indicate that the board size selection is invalid
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class InvalidBoardSizeException extends Exception
{
	public InvalidBoardSizeException() {
	}
	
	public InvalidBoardSizeException(String msg) {
		super(msg);
	}
	
	public InvalidBoardSizeException(Throwable cause) {
		super(cause);
	}
	
	public InvalidBoardSizeException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
