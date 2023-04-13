package sample01;
// UnChecked Exception
// 예외 발생한 곳에서는 예외처리를 안해도 된다. 
// 자신을 호출한 메소드에서 처리하면 된다.
public class ExceptionApp4 {
	
	public static void test2(String str) {
		test1(str);
	}

	public static void test1(String str) {
		int number = Integer.parseInt(str);
		System.out.println("number -> " + number);
	}
	
	public static void main(String[] args) {
		try {
			test1("1234");
			test2("1234오"); // parseInt 에서 예외가 발생하지만 test2로 위임되고, test2에서도 main메소드로 위임된다. 
		} catch (NumberFormatException ex) {
			System.out.println("유효한 숫자형식의 문자열이 아닙니다.");
		}
	}
	
}
