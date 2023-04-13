package sample03;
// RuntimeException을 상속받은 예외발생 클래스다.
public class BankingException extends RuntimeException {

	public BankingException() {}
	
	public BankingException(String message) {
		super(message);
	}
	
}
