package examples.program;

public class UserDefinedExceptions {

	public static void main(String[] args) throws MyOwnException {
		// TODO Auto-generated method stub
		division(10, 0);
	}
	
	public static void division(int a, int b) throws MyOwnException  {
		try {
			System.out.println(a/b);	
		}
		catch(Exception e) {
			//throw new exception that is user defined
			throw new MyOwnException("Hey! you are trying perform division using zero");
		}
		
	}

}

class MyOwnException extends Exception{
	public MyOwnException(String message) {
		super(message);
	}
}
