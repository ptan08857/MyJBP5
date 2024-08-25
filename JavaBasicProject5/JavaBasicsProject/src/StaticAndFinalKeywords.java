
public class StaticAndFinalKeywords {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		Excelutility obj=new Excelutility();
		
	}

}
class Employee{
	String name;
	int id;
	static String companyName="Test";
	
	public static void a() {
		companyName="abc";
	}
	
//	public static void setEmployeeName(String name) {
//		this.name=name;
//	}
}

class Excelutility{
	public static void readExcel() {
		
	}
	public static void writeExcel() {
		
	}
}