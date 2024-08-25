package a;

public class ClassA {
	
	public static void main(String args[]) {
		ClassA obj=new ClassA();
		
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
	
	public void a() {
		System.out.println("This is from ClassA");
	}
	
	protected void b() {
		
	}
	
	//Default access specifier
	void c() {
		
	}
	
	private void d() {
		
	}
	
	

}
