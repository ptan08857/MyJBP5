package examples.program;

public class StaticBlocksExample {

	public static void main(String[] args) {
		
		Student obj1=new Student();
		Student obj2=new Student();
	}

}

class Student{
	static String schoolName="Edureka School";
	String name;
	int rollNo;
	
	
	
	public Student() {
		System.out.println("Constructer got called");
	}
	
	static {
		System.out.println("Static block is invoked");
		schoolName="Edureka School";
	}
}
