package examples.program;

public class InstanceBlock {

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.name);
		
		Employee e2=new Employee("Bharath");
		System.out.println(e2.name);

	}

}

class Employee{
	String name="No name";
	
	
	//Instance block
	{
		System.out.println("Instance block testing");
		this.name="Default value from the data base or from REST call or something else";
		//Any common code that needs to be executed when the object is created.
	}
	
	public Employee() {
		System.out.println("Default constructor");
		
		
	}
	public Employee(String name) {
		System.out.println("Parameterized constructor");
		this.name=name;
		
	}
	
}