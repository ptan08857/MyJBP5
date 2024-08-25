
public class InheritanceExample {

	public static void main(String[] args) {
		CarA obj1=new CarA("Yello",1200);
		obj1.moveForward();
		obj1.steering();
		obj1.applyBreak();
		System.out.println(obj1.color);

		CarB obj2=new CarB("Black", 2000);
		obj2.moveForward();
		obj2.steering();
		obj2.applyBreak();
		obj2.sunRoof();
		System.out.println(obj2.color);
		
		
		CarA obj3=new CarB("White",3000);
		obj3.applyBreak();
		
	}

}

class CarA{//Parent class
	String color;
	int engineCc;
	
	public CarA(String color,int engineCc) {
		this.color="Red";
		this.engineCc=engineCc;
	}
	public CarA() {
		
	}
	
	public void moveForward() {
		System.out.println("Move forward");
	}
	
	public void applyBreak() {
		System.out.println("Manual Apply break");
	}
	
	public void steering() {
		System.out.println("Steering");
	}
}

class CarB extends CarA{//Child class or Sub class, CarB is inheriting capabilities of CarA

	public CarB(String color, int engineCc) {
		this.color=color;
		this.engineCc=engineCc;
	}
	public CarB() {
		
	}
	
	public void applyBreak() {//Method overriding - to provide a new implementation to the method
		System.out.println("ABS breaking system - Apply break");
	}
	
	public void sunRoof() {
		System.out.println("Open/Close sunroof");
	}
	
}

class CarC extends CarB{

	public CarC(String color, int engineCc) {
		this.color=color;
		this.engineCc=engineCc;
	}
	
}