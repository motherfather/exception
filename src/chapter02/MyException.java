package chapter02;

public class MyException extends Exception {
	private static final long serialVersionUID = -8693658269628419296L;	// 아직 뭔지 잘모름...
	
	public MyException() {
		super("MyException Occurs");
	}
	
	public MyException(String message) {
		super(message);
	}

}
