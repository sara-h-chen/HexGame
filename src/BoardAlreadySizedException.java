import java.lang.Exception;
/**
 * Exception to indicate that someone is trying to resize a board which is aready sized.
 * 
 * DO NOT CHANGE THIS FILE
 * 
 * @author Stephen McGough
 * @version 0.1
 */
public class BoardAlreadySizedException extends Exception
{
	public BoardAlreadySizedException() {
	}
	
	public BoardAlreadySizedException(String msg) {
		super(msg);
	}
	
	public BoardAlreadySizedException(Throwable cause) {
		super(cause);
	}
	
	public BoardAlreadySizedException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
