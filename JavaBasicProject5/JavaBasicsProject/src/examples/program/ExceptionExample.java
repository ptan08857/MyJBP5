package examples.program;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int result;
		
		try {
			result=a/b;
			System.out.println("Division:="+result);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You are trying to do division by zero");
		}
		finally {
			System.out.println("Division program execution completed successfully");
		}
		
		System.out.println("End of the program");
		
//		try {
//			//open database connection
//			//read data from database
//			//close the database connection
//		}
//		catch(Exception e) {
//			
//		}
//		finally {
//			
//		}

	}

}
