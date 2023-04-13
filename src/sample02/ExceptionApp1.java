package sample02;
// Throwable 주요 메소드
// getMessage , printStackTrace
public class ExceptionApp1 {

	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;
	}
	
	public static void main(String[] args) {
		
		try {
			int value = toInt("1234가");
			System.out.println(value);
		} catch (NumberFormatException ex) {
//			String errorMessage = ex.getMessage(); // getMessage 오류 메시지 메소드
//			System.out.println("오류 메시지: "+ errorMessage);
//			
//			String text = ex.toString();	// 예외클래스 반환
//			System.out.println("toString() -> " + text);
			// printStackTrace() 메소드 하나만 적어도 모든 에러 정보가 나와서 개발 시 필수 요소
			ex.printStackTrace(); // 메소드 실행 순서별로 에러 발생한 행 출력
		}
	}
}
