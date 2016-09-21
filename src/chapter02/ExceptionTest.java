package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		int k = 0;
		try {
			System.out.println("파일을 열었음");
			k = 1000 / a; // java.lang.ArithmeticException 발생
			System.out.println("more code..."); // 예외 발생으로 수행되지 않음

		} catch (ArithmeticException ex) {
			// 1.로그 남기기(파일) <=아직안배움
			
			// 2.사과(정상종료)
			System.out.println("죄송합니다. 예기치 않은...");
			
			// 3. 이거라도 못하겠으면,
			// ex.printStackTrace();
			
			return;
		} finally {
			System.out.println("자원정리");
		}

		System.out.println("결과는:" + k);

	}

}
