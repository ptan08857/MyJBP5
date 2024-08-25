
public class EncapsulationExample {

	public static void main(String[] args) {
		Student std1=new Student("Raj",23);
//		std1.name="Abc";
//		std1.rollNo=23;
		std1.setName("ABC");
		std1.setRollNo(23);
		std1.disp();
	}

}

class Student{
	private String name;
	private int rollNo;
	
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public void disp() {
		System.out.println("Name of the student:="+this.name);
		System.out.println("RollNo of the student:="+this.rollNo);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
}