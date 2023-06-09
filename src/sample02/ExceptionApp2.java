package sample02;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// 예외 변환하기 
public class ExceptionApp2 {

	//////////////////////////////////////////////////////////////////
	// 예외변환하기를 사용하지 않은 경우
	//	- main 메소드에서 호출하는 메소드들이 다양한 예외를 발생시킨다.	
	//	- 예외를 일괄처리하는 main 메소드에서 처리할 예외의 개수가 매우 많아진다.
	//////////////////////////////////////////////////////////////////
	
	
//	public static void writeText(String text) throws IOException {
//		FileWriter writer = new FileWriter("src/sample02/sample.txt");
//		writer.write(text);
//		writer.close();
//	}
//	
//	public static Date toDate(String text) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse(text);
//		return date;
//	}
//	
//	public static void main(String[] args) {
//		try {
//			writeText("예외변환하기");
//			Date date = toDate("2023-04-23");
//			System.out.println(date);
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		} catch (ParseException ex) {
//			ex.printStackTrace();
//
//		}
//	}
	
	/////////////////////////////////////////////////////////////
	// 예외 전환하기를 사용한 경우
	//	- main 메소드에서 호출하는 모든 메소드들이 Exception 예외를 발생하도록
	//	  실제 발생한 예외객체는 catch 블록을 이용해서 가로챘다.
	//	- throw 키워드를 이용해서 Exception 예외를 강제 발생시켰다.
	//	- main 메소드에서 호출하는 모든 메소드들이 Exception 예외를 발생시키기 때문에
	//	  main 메소드에서 일괄예외처리가 훨씬 쉬워진다.
	/////////////////////////////////////////////////////////////
	public static void writeFile(String text) throws Exception {
		// 예외 처리하고 Exception 예외 발생
		try {
			FileWriter writer = new FileWriter("src/sample02/sample.txt");
			writer.write(text);
			writer.close();
		} catch (IOException ex) {
			throw new Exception("읽고 쓰기 오류 발생", ex); // 예외의 전환
		}
	}
	
	public static Date toDate(String text) throws Exception{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat();
			Date date = sdf.parse(text);
			return date;
		} catch (ParseException ex) {
			throw new Exception("날짜 변환 오류 발생", ex); // CheckedException
//			throw new RuntimeException("날짜 변환 오류 발생", ex); // UncheckedException
		}
	}
	
	public static void main(String[] args) {
		try {
			writeFile("예외 전환하기 연습입니다.");
			Date date = toDate("2023-04-11");
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}










