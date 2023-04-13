package sample02;
/**
 * 사용자 정의 예외 Unchecked 클래스다.
 *
 */
public class CustomException extends RuntimeException {
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
