package sample03;
// 예외발생을 이용한 은행 업무 프로그램 만들기
public class Account {

	private int no;
	private String owner;
	private int password;
	private long balance;
	
	public Account() {}
	
	public Account(int no, String owner, int password, long balance) {
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
