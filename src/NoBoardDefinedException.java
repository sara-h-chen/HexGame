import java.lang.Exception;
/**
 * Exception to indicate that someone is trying to resize a board which is aready sized.
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class NoBoardDefinedException extends Exception
{
	public NoBoardDefinedException() {
	}
	
	public NoBoardDefinedException(String msg) {
		super(msg);
	}
	
	public NoBoardDefinedException(Throwable cause) {
		super(cause);
	}
	
	public NoBoardDefinedException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
