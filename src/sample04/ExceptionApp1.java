package sample04;

import java.io.FileWriter;
import java.io.IOException;
// close() - finally , AutoClose문법
// 자원점유하는 작업 - 입출력작업, 네트워크 통신 작업(첨부파일 다운로드) 등
public class ExceptionApp1 {
	// 기본
	public static void writeText1(String text) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/sample04/sample.txt");
			writer.write("연습1");
			// 입출력 작업이 모두 완료되면, 자원에 대한 점유를 해제시키는 메소드를 실행한다.
			writer.close();
		} catch (IOException ex) {
			try {
				if (writer != null) {
					// 입출력 작업 중 오류가 발생하면, 자원에 대한 점유를 해제시키는 메소드를 실행한다.
					writer.close();
				}
			} catch (Exception e) {

			}
			throw new RuntimeException("입출력오류", ex);
		}
	}
	// finally 
	public static void writerText2(String text) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/sample04/sample.txt");
			writer.write("연습2");
		} catch (IOException ex) {
			throw new RuntimeException("입출력오류", ex);
		} finally {
			// finally 블록은 예외발생 유무와 상관없이 반드시 실행되어야 하는 수행문을 작성하는 블록이다.
			// finally 블록에서 점유했던 자원을 해제시키는 메소드를 작성한다.
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException ex) {

			}
		}
	}
	// AutoClose 문법
	// autoClosealbe 인터페이스를 구현한 클래스는 자동자원해제 방식을 사용할 수 있다.
	/*
	 * try (AutoCloseable 인터페이스를 구현한 객체를 생성하는 코드) {
	 * 	
	 * } catch (예외클래스 변수명)
	 */
	public static void writeText3(String text) {
		try (FileWriter writer = new FileWriter("src/sample04/sample.txt")) {
			writer.write("연습2");
			writer.write("연습2");
			writer.write("연습2");
			writer.write("연습2");
		} catch (IOException ex) {
			throw new RuntimeException("입출력오류", ex);
		}
	}
	
}






